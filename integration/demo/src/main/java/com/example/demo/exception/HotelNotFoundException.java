package com.example.demo.exception;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String s) {
        super(s);
    }
}
