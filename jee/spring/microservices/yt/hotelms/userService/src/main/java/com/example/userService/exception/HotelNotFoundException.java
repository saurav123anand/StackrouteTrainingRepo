package com.example.userService.exception;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String s) {
        super(s);
    }
}
