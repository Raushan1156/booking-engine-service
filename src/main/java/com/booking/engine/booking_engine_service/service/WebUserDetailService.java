package com.booking.engine.booking_engine_service.service;

import com.booking.engine.booking_engine_service.entity.UserEntity;
import com.booking.engine.booking_engine_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserDetails loadUserByUsername(String email){
        System.out.println("loadUserByUsername is called....");
        try {
            System.out.println("Loading user from DB: " + email);
            UserEntity userEntity = userRepository.findByUserEmail(email);
            if (userEntity != null)
                System.out.println(email+" found in db. userEntity is:  "+userEntity.toString());
            else
                System.out.println(email+" not found in db. userEntity is:  "+userEntity);
            return userEntity;
        }catch (UsernameNotFoundException usernameNotFoundException){
            throw new UsernameNotFoundException(email + " is not found in the userEntity table."+
                    " Please enter the correct username.");
        }
    }
}
