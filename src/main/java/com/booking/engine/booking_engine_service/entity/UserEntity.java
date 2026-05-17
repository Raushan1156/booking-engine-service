package com.booking.engine.booking_engine_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users_entity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @CreationTimestamp
    @Column(name = "createdAt", nullable = false, updatable = false)
    LocalDateTime createdTimeStamp;

    @Column(
            name = "name",
            nullable = false,
            length = 100
    )
    String name;

    @Column(
            name = "email",
            nullable = false,
            length = 100,
            unique = true
    )
    String email;

    @Column(
            name = "mobileNumber",
            nullable = false,
            length = 11,
            unique = true
    )
    String mobileNumber;

    @Column(
            name = "password",
            nullable = false
    )
    String password;

}
