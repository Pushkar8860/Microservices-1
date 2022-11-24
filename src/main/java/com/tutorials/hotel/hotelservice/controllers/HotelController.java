package com.tutorials.hotel.hotelservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorials.hotel.hotelservice.Entity.Hotel;
import com.tutorials.hotel.hotelservice.services.HotelService;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/create-hotel")
    public ResponseEntity<?> createuser(@RequestBody Hotel hotel) {
        Hotel hotel1 = this.hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    @GetMapping("/get-hotel/{hotelId}")
    public ResponseEntity<?> getUser(@PathVariable String hotelId) {
        Hotel hotel1 = this.hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel1);
    }

    @GetMapping("/get-all-hotels")
    public ResponseEntity<?> getAllUser() {
        List<Hotel> allHotels = this.hotelService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(allHotels);
    }
}
