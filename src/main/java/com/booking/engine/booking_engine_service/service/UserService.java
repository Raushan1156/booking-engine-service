package com.booking.engine.booking_engine_service.service;

import com.booking.engine.booking_engine_service.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    public UserResponseDto getUserById(int id);
    public UserResponseDto getUserByEmail(String email);
    public UserResponseDto getUserByMobileNumber(String mobileNumber);
    public List<UserResponseDto> getAllUsers();
    public UserResponseDto deleteUserById(int id);
}
