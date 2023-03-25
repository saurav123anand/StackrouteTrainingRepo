package com.example.demo.repository;

import com.example.demo.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {
    Optional<Hotel> findByName(String name);
}
