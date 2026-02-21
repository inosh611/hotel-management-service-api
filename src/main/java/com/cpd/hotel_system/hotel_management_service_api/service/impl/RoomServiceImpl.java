package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.RoomPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomService;
import org.springframework.stereotype.Service;


@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void create(RequestRoomDto requestRoomDto) {

    }

    @Override
    public void update(RequestRoomDto requestRoomDto, String roomId) {

    }

    @Override
    public void delete(String roomId) {

    }

    @Override
    public ResponseRoomDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginateResponseDto findAll(int page, int size) {
        return null;
    }
}
