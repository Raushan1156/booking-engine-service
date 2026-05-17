package com.booking.engine.booking_engine_service.service.impl;

import com.booking.engine.booking_engine_service.util.exception.ResourceNotFoundException;
import com.booking.engine.booking_engine_service.dto.UserResponseDto;
import com.booking.engine.booking_engine_service.entity.UserEntity;
import com.booking.engine.booking_engine_service.repository.UserRepository;
import com.booking.engine.booking_engine_service.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
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
        UserEntity entityById = usersRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User is not found with id:"+id));
        return modelMapper.map(entityById,UserResponseDto.class);
    }

    @Override
    public UserResponseDto getUserByEmail(String email) {
        UserEntity userEntity = usersRepository.findByUserEmail(email);
        if (userEntity == null)
                throw  new ResourceNotFoundException("User is not found with email:"+email);
        return modelMapper.map(userEntity, UserResponseDto.class);
    }

    @Override
    public UserResponseDto getUserByMobileNumber(String mobileNumber) {
        UserEntity userEntity = usersRepository.findByMobileNumber(mobileNumber);
        if (userEntity == null)
            throw  new ResourceNotFoundException("User is not found with email:"+mobileNumber);
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
                ()-> new ResourceNotFoundException("User is not found with id:"+id));
        usersRepository.deleteById(id);
        return modelMapper.map(entity,UserResponseDto.class);
    }

}
