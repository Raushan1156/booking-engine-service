//package com.booking.engine.booking_engine_service.entity;
//
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.annotation.AccessType;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class WebUsersDetails implements UserDetails {
//
//    String username;
//    String password;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of();
//    }
//
//    @Override
//    public String getPassword() {
//        System.out.println("password is: "+password);
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        System.out.println("username is: "+username);
//        return username;
//    }
//}
