package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.BranchPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;


@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto requestBranchDto) {

    }

    @Override
    public void update(RequestBranchDto requestBranchDto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
