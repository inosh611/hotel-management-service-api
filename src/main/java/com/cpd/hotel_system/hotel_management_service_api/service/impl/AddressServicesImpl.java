package com.cpd.hotel_system.hotel_management_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.service.AddressServices;
import org.springframework.stereotype.Service;

@Service
public class AddressServicesImpl implements AddressServices {
    @Override
    public void create(RequestAddressDto requestAddressDto) {

    }

    @Override
    public void update(RequestAddressDto requestBranchDto, String addressId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public ResponseAddressDto findByBranchId(String branchId) {
        return null;
    }
}
