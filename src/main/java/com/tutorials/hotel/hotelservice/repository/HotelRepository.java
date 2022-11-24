package com.tutorials.hotel.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.hotel.hotelservice.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
