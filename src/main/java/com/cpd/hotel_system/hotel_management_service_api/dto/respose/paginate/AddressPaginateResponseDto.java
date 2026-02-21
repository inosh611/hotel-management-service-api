package com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseAddressDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private List<ResponseAddressDto> details;
    private long dataCount;

}
