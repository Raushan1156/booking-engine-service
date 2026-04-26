package com.booking.engine.booking_engine_service.auth.service.impl;

import com.booking.engine.booking_engine_service.auth.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.auth.dto.RegistrationResponse;
import com.booking.engine.booking_engine_service.user.entity.UserEntity;
import com.booking.engine.booking_engine_service.user.repository.UserRepository;
import com.booking.engine.booking_engine_service.auth.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final ModelMapper modelMapper;
    private final UserRepository usersRepository;

    public RegistrationServiceImpl(ModelMapper modelMapper, UserRepository usersRepository) {
        this.modelMapper = modelMapper;
        this.usersRepository = usersRepository;
    }

    public String apiTest(){
        System.out.println("Service method called.");
        return "Service method called.";
    }

    @Override
    public RegistrationResponse saveNewUser(RegistrationRequest registrationRequest){
        UserEntity usersEntity = modelMapper.map(registrationRequest, UserEntity.class);
        UserEntity savedEntity = usersRepository.save(usersEntity);
        return modelMapper.map(savedEntity, RegistrationResponse.class);
    }
}
