package com.booking.engine.booking_engine_service.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="room_type",
            nullable = false
    )
    String roomType;

    Long cost;

    @ManyToOne
    @JoinColumn(name="hotel_id",
            nullable = false,
            unique = false
    )
    private Hotel hotel;

}
