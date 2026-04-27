package com.booking.engine.booking_engine_service.user.service.impl;

import com.booking.engine.booking_engine_service.user.dto.UserResponseDto;
import com.booking.engine.booking_engine_service.user.entity.UserEntity;
import com.booking.engine.booking_engine_service.user.repository.UserRepository;
import com.booking.engine.booking_engine_service.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository usersRepository;
    private final ModelMapper modelMapper;
    public UserServiceImpl(UserRepository usersRepository, ModelMapper modelMapper){
        this.usersRepository=usersRepository;
        this.modelMapper=modelMapper;
    }
    @Override
    public UserResponseDto getUserById(int id) {
        UserEntity entityById = usersRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return modelMapper.map(entityById,UserResponseDto.class);
    }

    @Override
    public UserResponseDto getUserByEmail(String email) {
        UserEntity userEntity = usersRepository.findByEmail(email);
        return modelMapper.map(userEntity, UserResponseDto.class);
    }

    @Override
    public UserResponseDto getUserByMobileNumber(String mobileNumber) {
        UserEntity userEntity = usersRepository.findByMobileNumber(mobileNumber);
        return modelMapper.map(userEntity,UserResponseDto.class);
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<UserEntity> userEntityList = usersRepository.findAll();
        List<UserResponseDto> userDtoList = userEntityList.stream()
                .map(userEntity -> modelMapper.map(userEntity,UserResponseDto.class))
                .toList();
        return userDtoList;
    }

    @Override
    public UserResponseDto deleteUserById(int id) {
        UserEntity entity = usersRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("User not found"));
        usersRepository.deleteById(id);
        return modelMapper.map(entity,UserResponseDto.class);
    }
}
