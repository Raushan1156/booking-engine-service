package com.booking.engine.booking_engine_service.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {

        Long id;
        String name;
        String email;
        String mobileNumber;
}
