package com.booking.engine.booking_engine_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegistrationRequest {

    @NotBlank(message = "userName can't be empty.")
    private String userName;

    @NotBlank(message = "userEmail can't be empty.")
    @Email
    private String userEmail;

    @NotEmpty(message = "mobileNumber can't be empty.")
    private String mobileNumber;
}

