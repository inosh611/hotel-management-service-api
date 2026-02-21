package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.FacilityPaginateResponseDto;

public interface FacilityService {
    public void create(RequestFacilityDto requestFacilityDto);
    public void update(RequestFacilityDto requestFacilityDto, String facilityId);
    public void delete(String facilityId);
    public ResponseFacilityDto findById(String facilityId);
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId);
}
