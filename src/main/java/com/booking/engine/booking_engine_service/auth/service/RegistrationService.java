package com.booking.engine.booking_engine_service.auth.service;

import com.booking.engine.booking_engine_service.auth.dto.RegistrationRequest;
import com.booking.engine.booking_engine_service.auth.dto.RegistrationResponse;

public interface RegistrationService {
    public RegistrationResponse saveNewUser(RegistrationRequest registrationRequest);
    public String apiTest();
}

