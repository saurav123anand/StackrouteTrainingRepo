package com.example.ratingsService.service;

import com.example.ratingsService.entity.Rating;

import java.util.List;

public interface IRatingService {
    //create hotel
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by userId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
