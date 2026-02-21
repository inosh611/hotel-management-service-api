package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.RoomImageResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.RoomImageService;
import org.springframework.stereotype.Service;


@Service
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomImageDto requestRoomImageDto) {

    }

    @Override
    public void update(RequestRoomImageDto requestRoomImageDto, String ImageId) {

    }

    @Override
    public void delete(String imageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String imageId) {
        return null;
    }

    @Override
    public RoomImageResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
