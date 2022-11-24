package com.tutorials.hotel.hotelservice.services;

import java.util.List;

import com.tutorials.hotel.hotelservice.Entity.Hotel;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotel(String id);
}
