package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.HotelPaginateResponseDto;

public interface HotelService {
    public void create(RequestHotelDto requestHotelDto);
    public void update(RequestHotelDto requestHotelDto, String hotelId);
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId);
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
