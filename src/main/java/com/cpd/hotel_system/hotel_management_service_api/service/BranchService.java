package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.BranchPaginateResponseDto;

public interface BranchService {
    public void create(RequestBranchDto requestBranchDto);
    public void update(RequestBranchDto requestBranchDto, String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginateResponseDto findAll(int page, int size, String searchText);
    public BranchPaginateResponseDto findAllByHotelId(int page, int size,String hotelId, String searchText);
}
