package com.booking.engine.booking_engine_service.util.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        System.out.println("securityFilterChain is called....");
        httpSecurity.authorizeHttpRequests(auth -> auth
                            .requestMatchers("/auth/registration").permitAll()
                                .anyRequest().authenticated()

                )
                .csrf(csrf -> csrf.disable())
                .httpBasic(withDefaults())
        ;
        System.out.println("securityFilterChain is closing and returning the httpSecurity build.....");
        return httpSecurity.build();
    }

}
