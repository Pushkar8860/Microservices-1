package com.tutorials.ratings.ratings.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorials.ratings.ratings.Entity.Rating;
import com.tutorials.ratings.ratings.services.RatingService;;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/create-rating")
    public ResponseEntity<?> createRating(@RequestBody Rating rating) {
        rating.setRatingId((UUID.randomUUID().toString()));
        Rating rating1 = this.ratingService.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping("/get-rating/{ratingId}")
    public ResponseEntity<?> getRating(@PathVariable String ratingId) {
        Optional<Rating> rating1 = this.ratingService.getratings(ratingId);
        return ResponseEntity.status(HttpStatus.OK).body(rating1);
    }

    @GetMapping("/get-rating-by-userId/{userId}")
    public ResponseEntity<?> getRatingByUserId(@PathVariable String userId) {
        List<Rating> rating1 = this.ratingService.getAllByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(rating1);
    }

    @GetMapping("/get-hotel-by-hotelId/{hotelId}")
    public ResponseEntity<?> getRatingByHotelId(@PathVariable String hotelId) {
        List<Rating> rating1 = this.ratingService.getAllByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(rating1);
    }

    @GetMapping("/get-all-ratings")
    public ResponseEntity<?> getAllRatings() {
        List<Rating> allRatings = this.ratingService.getAllRating();
        return ResponseEntity.status(HttpStatus.OK).body(allRatings);
    }

}
