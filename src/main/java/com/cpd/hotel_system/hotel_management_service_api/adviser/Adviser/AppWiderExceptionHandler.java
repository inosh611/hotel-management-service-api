package com.cpd.hotel_system.hotel_management_service_api.adviser.Adviser;

import com.cpd.hotel_system.hotel_management_service_api.exceptions.EntryNotFoundException;
import com.cpd.hotel_system.hotel_management_service_api.util.StandedResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWiderExceptionHandler {
    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<StandedResponseDto> handleEntryNotFoundException(EntryNotFoundException
                                                                                   ex){
        return new ResponseEntity<>(
                new StandedResponseDto(404, ex.getMessage(), ex),
                HttpStatus.NOT_FOUND
        );
    }
}
