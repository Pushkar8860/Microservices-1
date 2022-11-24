package com.tutorials.hotel.hotelservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.hotel.hotelservice.Entity.Hotel;
import com.tutorials.hotel.hotelservice.exceptions.ResourceNotFoundException;
import com.tutorials.hotel.hotelservice.repository.HotelRepository;
import com.tutorials.hotel.hotelservice.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        hotel.setId(UUID.randomUUID().toString());
        return this.hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return this.hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return this.hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("hotel Not Found with given id : " + id));
    }

}
