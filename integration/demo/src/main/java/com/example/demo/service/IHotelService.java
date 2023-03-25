package com.example.demo.service;

import com.example.demo.entity.Hotel;

import java.util.List;

public interface IHotelService {
    Hotel add(Hotel hotel);
    Hotel findById(int id);
    Hotel findByName(String name);
    List<Hotel> findAll();
}
