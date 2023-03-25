package com.example.demo.service;

import com.example.demo.entity.Hotel;
import com.example.demo.exception.HotelNotFoundException;
import com.example.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService{
    @Autowired
    private HotelRepository repository;

    @Override
    public Hotel add(Hotel hotel) {
        return repository.save(hotel);
    }

    @Override
    public Hotel findById(int id) {
        return repository.findById(id).orElseThrow(()->new HotelNotFoundException("hotel not found for id "+id));
    }

    @Override
    public Hotel findByName(String name) {
        return repository.findByName(name).orElseThrow(()->new HotelNotFoundException("there is no hotel with name"+name));
    }

    @Override
    public List<Hotel> findAll() {
        return repository.findAll();
    }
}
