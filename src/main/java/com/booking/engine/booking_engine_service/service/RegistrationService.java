package com.booking.engine.booking_engine_service.service;

import com.booking.engine.booking_engine_service.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.dto.RegistrationResponse;

public interface RegistrationService {
    public RegistrationResponse saveNewUser(RegistrationRequest registrationRequest);
    public String apiTest();
}

