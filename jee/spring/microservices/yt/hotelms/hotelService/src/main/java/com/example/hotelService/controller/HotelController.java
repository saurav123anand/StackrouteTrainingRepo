package com.example.hotelService.controller;

import com.example.hotelService.entity.Hotel;
import com.example.hotelService.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private IHotelService service;

    @PostMapping("/createhotel")
    public Hotel createHotel(@RequestBody Hotel hotel){
        return service.create(hotel);
    }
    @GetMapping("/findbyid/{hotelId}")
    public Hotel findById(@PathVariable String hotelId){
        return service.get(hotelId);
    }
    @GetMapping("/findall")
    public List<Hotel> findAll(){
        return service.getAll();
    }

}
