package com.example.ratingsService.service;

import com.example.ratingsService.entity.Rating;
import com.example.ratingsService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements IRatingService{
    @Autowired
    private RatingRepository repository;

    @Override
    public Rating create(Rating rating) {
        String randomId=UUID.randomUUID().toString();
        rating.setRatingId(randomId);
        Rating added=repository.save(rating);
        return added;
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}
