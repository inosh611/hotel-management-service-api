package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import com.cpd.hotel_system.hotel_management_service_api.entity.Hotel;
import com.cpd.hotel_system.hotel_management_service_api.entity.Room;
import com.cpd.hotel_system.hotel_management_service_api.exceptions.EntryNotFoundException;
import com.cpd.hotel_system.hotel_management_service_api.repo.HotelRepo;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_service_api.util.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;
    @Override
    public void create(RequestHotelDto requestHotelDto) {
        try {
            hotelRepo.save(toHotel(requestHotelDto));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(RequestHotelDto requestHotelDto, String hotelId) throws SQLException {
        Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found"));
        selectedHotel.setHotelName(requestHotelDto.getHotelName());
        selectedHotel.setUpdatedAt(LocalDateTime.now());
        selectedHotel.setDescription(byteCodeHandler.stringToBlob(requestHotelDto.getDescription()));
        selectedHotel.setStartingFrom(requestHotelDto.getStartingFrom());
        selectedHotel.setStarRating(requestHotelDto.getStarRating());
        hotelRepo.save(selectedHotel);
    }

    @Override
    public void delete(String hotelId) {
        hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found"));
        hotelRepo.deleteById(hotelId);
    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    //mapStruct , moddelMappers use krannath puluwan

    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return dto==null?null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelID(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(byteCodeHandler.stringToBlob(dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }
    private ResponseHotelDto toResponseHotelDto(Hotel hotel) throws SQLException {
        return hotel==null?null:
                ResponseHotelDto.builder()
                        .hotelId(hotel.getHotelID())
                        .hotelName(hotel.getHotelName())
                        .activeStatus(hotel.isActiveStatus())
                        .startingForm(hotel.getStartingFrom())
                        .updateAt(hotel.getUpdatedAt())
                        .createdAt(hotel.getCreatedAt())
                        .description(byteCodeHandler.blobToString(hotel.getDescription()))
                        .branches(
                                hotel.getBranches().stream().map(this::toResponseBranchDto).toList()
                        )
                        .build();
    }

    private ResponseBranchDto toResponseBranchDto(Branch branch) {
        return branch == null ? null :
                ResponseBranchDto.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .roomCount(branch.getRoomCount())
                        .branchType(branch.getBranchType())
                        .build();
    }


}
