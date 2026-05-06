package com.booking.engine.booking_engine_service.controller;

import com.booking.engine.booking_engine_service.dto.LoginRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
public class login {

    @GetMapping(path = "/loginApiTest")
    public String apiTest(){
        return "login api test.";
    }

    @PostMapping(path = "/login")
    public LoginRequest login(@RequestBody @Valid LoginRequest loginRequest) {
        return loginRequest;
    }
}
