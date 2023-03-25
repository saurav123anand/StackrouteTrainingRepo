package com.example.ratingsService.controller;

import com.example.ratingsService.entity.Rating;
import com.example.ratingsService.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private IRatingService service;

    @PostMapping("/createrating")
    public Rating create(@RequestBody Rating rating){
       return service.create(rating);
    }
    @GetMapping
    public List<Rating> getRatings(){
        return service.getRatings();
    }
    @GetMapping("/users/{userId}")
    public List<Rating> getRatingByUserId(@PathVariable String userId){
        return service.getRatingByUserId(userId);
    }
    @GetMapping("/hotels/{hotelId}")
    public List<Rating> getRatingByHotelId(@PathVariable String hotelId){
        return service.getRatingByHotelId(hotelId);
    }



}
