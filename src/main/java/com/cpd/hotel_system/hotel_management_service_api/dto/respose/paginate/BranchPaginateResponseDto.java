package com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseBranchDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomImageDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchPaginateResponseDto {
    private List<ResponseBranchDto> dataList;
    private long dataCount;
}
