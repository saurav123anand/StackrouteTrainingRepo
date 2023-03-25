package com.example.shoppingms.controller;

import com.example.shoppingms.exception.ShoppingItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class CentralizedExceptionHandler {
    @ExceptionHandler(ShoppingItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String ItemNotFoundHandler(ShoppingItemNotFoundException e){
        return e.getMessage();
    }
    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            ConstraintViolationException.class
    })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String InvalidHandler(Exception e){
        return e.getMessage();
    }
}
