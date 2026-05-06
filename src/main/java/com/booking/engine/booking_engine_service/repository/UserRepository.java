package com.booking.engine.booking_engine_service.repository;

import com.booking.engine.booking_engine_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public UserEntity findByEmail(String email);
    public UserEntity findByMobileNumber(String mobileNumber);
}
