package com.tutorials.ratings.ratings.services;

import java.util.List;
import java.util.Optional;

import com.tutorials.ratings.ratings.Entity.*;

public interface RatingService {

    Rating create(Rating rating);

    List<Rating> getAllRating();

    Optional<Rating> getratings(String ratingId);

    List<Rating> getAllByUserId(String userId);

    List<Rating> getAllByHotelId(String hotelId);
}
