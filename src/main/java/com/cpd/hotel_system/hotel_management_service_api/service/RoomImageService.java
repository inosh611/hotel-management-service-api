package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.RoomImageResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto requestRoomImageDto);
    public void update(RequestRoomImageDto requestRoomImageDto, String ImageId);
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String imageId);
    public RoomImageResponseDto findAll(int page, int size, String roomId);
}
