package com.booking.engine.booking_engine_service.user.controller;

import com.booking.engine.booking_engine_service.user.dto.UserResponseDto;
import com.booking.engine.booking_engine_service.user.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserDetails {

    private final UserServiceImpl userServiceImpl;
    public UserDetails(UserServiceImpl userServiceImpl){
        this.userServiceImpl=userServiceImpl;
    }

    @GetMapping(path = "/{id}")
    public UserResponseDto getUserById(@PathVariable int id){
        return userServiceImpl.getUserById(id);
    }

    @GetMapping()
    public UserResponseDto getUser(@RequestParam(required = false) String email,
                                          @RequestParam(required = false) String mobileNumber){
        if(email == null){
            return userServiceImpl.getUserByMobileNumber(mobileNumber);
        }
        else if(mobileNumber == null){
            return userServiceImpl.getUserByEmail(email);
        }
        throw new RuntimeException("Please provide correct email or mobile number");
    }

}
