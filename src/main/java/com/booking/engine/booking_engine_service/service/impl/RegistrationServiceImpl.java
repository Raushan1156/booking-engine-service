package com.booking.engine.booking_engine_service.service.impl;

import com.booking.engine.booking_engine_service.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.dto.RegistrationResponse;
import com.booking.engine.booking_engine_service.service.RegistrationService;
import com.booking.engine.booking_engine_service.entity.UserEntity;
import com.booking.engine.booking_engine_service.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final ModelMapper modelMapper;
    private final UserRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    public RegistrationServiceImpl(ModelMapper modelMapper, UserRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.modelMapper = modelMapper;
        this.usersRepository = usersRepository;
        this.passwordEncoder=passwordEncoder;
    }

    public String apiTest(){
        System.out.println("Service method called.");
        return "Service method called.";
    }

    @Override
    public RegistrationResponse saveNewUser(RegistrationRequest registrationRequest){
        UserEntity usersEntity = modelMapper.map(registrationRequest, UserEntity.class);
        usersEntity.setPassword(encodePassword(usersEntity.getPassword()));
        UserEntity savedEntity = usersRepository.save(usersEntity);
        System.out.println(savedEntity);
        return modelMapper.map(savedEntity, RegistrationResponse.class);
    }

    @Override
    public String encodePassword(String password) {
        System.out.println("passwordEncoder method is called....");
        return passwordEncoder.encode(password);
    }
}
