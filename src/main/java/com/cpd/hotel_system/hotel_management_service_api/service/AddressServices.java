package com.cpd.hotel_system.hotel_management_service_api.service;


import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseAddressDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate.AddressPaginateResponseDto;

public interface AddressServices {
    public void create(RequestAddressDto requestAddressDto);
    public void update(RequestAddressDto requestBranchDto, String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByBranchId(String branchId);
}
