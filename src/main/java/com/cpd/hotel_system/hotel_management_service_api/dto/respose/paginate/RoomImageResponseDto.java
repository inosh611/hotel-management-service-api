package com.cpd.hotel_system.hotel_management_service_api.dto.respose.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.respose.ResponseRoomImageDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImageResponseDto {
    private List<ResponseRoomImageDto> dataList;
    private long dataCount;
}
