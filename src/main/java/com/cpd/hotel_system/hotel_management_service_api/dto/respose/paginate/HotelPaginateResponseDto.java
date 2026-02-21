package com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseHotelDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelPaginateResponseDto {
    private List<ResponseHotelDto> dataList;
    private long dataCount;
}
