package com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomPaginateResponseDto {
    private List<ResponseRoomDto> details;
    private long dataCount;
}
