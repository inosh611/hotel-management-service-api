package com.cpd.hotel_system.hotel_management_service_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel-management/api/v1/test")
public class TestController {

    @GetMapping("/check")
    public String test(){
        return "Hotel Management System: Front Desk is now OPEN! \uD83D\uDECE\uFE0F";
    }
}

