package com.booking.engine.booking_engine_service.controller;

import com.booking.engine.booking_engine_service.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.dto.RegistrationResponse;
import com.booking.engine.booking_engine_service.service.impl.RegistrationServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
public class Register {

    RegistrationServiceImpl registrationServiceImpl;
    public Register(RegistrationServiceImpl registrationServiceImpl){
        this.registrationServiceImpl=registrationServiceImpl;

    }
    // testing api to check the app status
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

