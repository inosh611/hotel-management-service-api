package com.cpd.hotel_system.hotel_management_service_api.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class StandedResponseDto {
    private int code;
    private String message;
    private Object data;
}
