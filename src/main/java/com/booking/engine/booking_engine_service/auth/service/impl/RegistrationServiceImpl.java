package com.booking.engine.booking_engine_service.auth.service.impl;

import com.booking.engine.booking_engine_service.auth.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.auth.dto.RegistrationResponse;
import com.booking.engine.booking_engine_service.auth.entity.RegistrationEntity;
import com.booking.engine.booking_engine_service.auth.repository.RegistrationRepo;
import com.booking.engine.booking_engine_service.auth.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final ModelMapper modelMapper;
    private final RegistrationRepo registrationRepo;

    public RegistrationServiceImpl(ModelMapper modelMapper, RegistrationRepo registrationRepo) {
        this.modelMapper = modelMapper;
        this.registrationRepo = registrationRepo;
    }

    public String apiTest(){
        System.out.println("Service method called.");
        return "Service method called.";
    }

    @Override
    public RegistrationResponse saveNewUser(RegistrationRequest registrationRequest){
        RegistrationEntity registrationEntity = modelMapper.map(registrationRequest,RegistrationEntity.class);
        RegistrationEntity savedEntity = registrationRepo.save(registrationEntity);
        return modelMapper.map(savedEntity, RegistrationResponse.class);
    }
}
