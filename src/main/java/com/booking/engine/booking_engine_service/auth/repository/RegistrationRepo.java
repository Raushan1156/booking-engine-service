package com.booking.engine.booking_engine_service.auth.repository;

import com.booking.engine.booking_engine_service.auth.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationEntity,Integer> {
}
