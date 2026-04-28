package com.booking.engine.booking_engine_service.user.controller;

import com.booking.engine.booking_engine_service.user.dto.UserResponseDto;
import com.booking.engine.booking_engine_service.user.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    private final UserServiceImpl userServiceImpl;
    public AdminController(UserServiceImpl userServiceImpl){
        this.userServiceImpl=userServiceImpl;
    }

    @GetMapping(path = "/get_all_users")
    public List<UserResponseDto> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }

    @DeleteMapping(path = "/{id}")
    public UserResponseDto deleteUserById(@PathVariable int id){
        return userServiceImpl.deleteUserById(id);
    }
}
