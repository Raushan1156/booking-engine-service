package com.booking.engine.booking_engine_service.util.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ConfigClass {

    @Bean
    public ModelMapper modelMapper(){
        System.out.println("model mapper object is created....");
        return new ModelMapper();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        System.out.println("passwordEncoder object is created....");
        return new BCryptPasswordEncoder();
    }
}
