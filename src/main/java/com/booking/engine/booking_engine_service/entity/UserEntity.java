package com.booking.engine.booking_engine_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users_entity")
public class UserEntity implements UserDetails {

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
    String username;

    @Column(
            name = "email",
            nullable = false,
            length = 100,
            unique = true
    )
    String userEmail;

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

}
