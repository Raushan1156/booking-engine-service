package com.booking.engine.booking_engine_service.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

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

    @Column(name = "password")
    @NotBlank(message = "password can't be empty.")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
//    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\\\":{}|<>]).*$\n",
//            message = "Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character")
    private String password;
}

