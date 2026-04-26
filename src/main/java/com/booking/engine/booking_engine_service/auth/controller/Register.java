package com.booking.engine.booking_engine_service.auth.controller;

import com.booking.engine.booking_engine_service.auth.dto.RegaitrationRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
public class Register {

    @GetMapping(path = "/registerApiTest")
    public String apiTest(){
        return "apiTest method called.";
    }

    @PostMapping(path = "/registration")
    public RegaitrationRequest login(@RequestBody @Valid RegaitrationRequest regaitrationRequest){
        return regaitrationRequest;
    }
}

