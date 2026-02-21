package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.FacilityPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.FacilityService;
import org.springframework.stereotype.Service;


@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto requestFacilityDto) {

    }

    @Override
    public void update(RequestFacilityDto requestFacilityDto, String facilityId) {

    }

    @Override
    public void delete(String facilityId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
