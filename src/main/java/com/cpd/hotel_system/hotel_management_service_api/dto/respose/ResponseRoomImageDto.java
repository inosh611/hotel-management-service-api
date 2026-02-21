package com.cpd.hotel_system.hotel_management_service_api.dto.respose;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomImageDto {
    private Long id;
    private String directory;
    private String fileName;
    private String resourceUrl;
    private String branchID;
}
