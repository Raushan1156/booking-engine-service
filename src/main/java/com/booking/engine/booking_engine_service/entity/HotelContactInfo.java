package com.booking.engine.booking_engine_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "hotel_contact_info")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HotelContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String completeAddress;
    String location;

    @Email
    String email;
    String phoneNumber;



}
