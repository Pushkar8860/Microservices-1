package com.tutorials.ratings.ratings.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.ratings.ratings.Entity.*;
import com.tutorials.ratings.ratings.repository.*;
import com.tutorials.ratings.ratings.services.*;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        return this.ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return this.ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllByUserId(String userId) {
        return this.ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllByHotelId(String hotelId) {
        return this.ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public Optional<Rating> getratings(String ratingId) {
        return this.ratingRepository.findById(ratingId);
    }

}
