package com.booking.engine.booking_engine_service.service;

import com.booking.engine.booking_engine_service.entity.UserEntity;
import com.booking.engine.booking_engine_service.entity.WebUsersDetails;
import com.booking.engine.booking_engine_service.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class WebUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public WebUsersDetails loadUserByUsername(String username){
        try {
            System.out.println("Loading user from DB: " + username);
            return modelMapper.map(userRepository.findByEmail(username), WebUsersDetails.class);
        }catch (UsernameNotFoundException usernameNotFoundException){
            throw new UsernameNotFoundException(username + " is not found in the userEntity table."+
                    " Please enter the correct username.");
        }
    }
}
