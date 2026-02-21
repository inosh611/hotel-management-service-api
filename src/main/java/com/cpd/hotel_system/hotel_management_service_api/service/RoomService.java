package com.cpd.hotel_system.hotel_management_service_api.service;


import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.RoomPaginateResponseDto;

public interface RoomService {
    public void create(RequestRoomDto requestRoomDto);
    public void update(RequestRoomDto requestRoomDto, String roomId);
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginateResponseDto findAll(int page, int size);
}
