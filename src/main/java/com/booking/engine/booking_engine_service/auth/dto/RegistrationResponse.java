package com.booking.engine.booking_engine_service.auth.dto;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationResponse {

    Long id;
    LocalDateTime createdTimeStamp;
    String name;
    String email;
    String mobileNumber;
}
