package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.HotelService;
import org.springframework.stereotype.Service;


@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void create(RequestHotelDto requestHotelDto) {

    }

    @Override
    public void update(RequestHotelDto requestHotelDto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }
}
