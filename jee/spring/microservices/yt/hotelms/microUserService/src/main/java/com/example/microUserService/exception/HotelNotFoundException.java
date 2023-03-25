package com.example.microUserService.exception;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String s) {
        super(s);
    }
}
