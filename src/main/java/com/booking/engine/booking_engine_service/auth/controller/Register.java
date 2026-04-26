package com.booking.engine.booking_engine_service.auth.controller;

import com.booking.engine.booking_engine_service.auth.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.auth.dto.RegistrationResponse;
import com.booking.engine.booking_engine_service.auth.service.RegistrationService;
import com.booking.engine.booking_engine_service.auth.service.impl.RegistrationServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
public class Register {

    RegistrationServiceImpl registrationServiceImpl;
    public Register(RegistrationServiceImpl registrationServiceImpl){
        this.registrationServiceImpl=registrationServiceImpl;

    }
    @GetMapping(path = "/registerApiTest")
    public String apiTest(){
        return registrationServiceImpl.apiTest();
    }

    @PostMapping(path = "/registration")
    public RegistrationResponse login(@RequestBody @Valid RegistrationRequest registrationRequest){
        System.out.println(registrationRequest);
        return registrationServiceImpl.saveNewUser(registrationRequest);
    }
}

