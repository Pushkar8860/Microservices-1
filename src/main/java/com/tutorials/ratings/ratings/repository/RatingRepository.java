package com.tutorials.ratings.ratings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tutorials.ratings.ratings.Entity.*;

public interface RatingRepository extends JpaRepository<Rating, String> {

    @Query(value = "Select * from ratings where hotel_id=?1", nativeQuery = true)
    List<Rating> findByHotelId(String hotelId);

    @Query(value = "Select * from ratings where user_id=?1", nativeQuery = true)
    List<Rating> findByUserId(String userId);

}
