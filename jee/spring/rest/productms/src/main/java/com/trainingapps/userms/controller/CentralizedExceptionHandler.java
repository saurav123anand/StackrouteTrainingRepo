package com.trainingapps.userms.controller;

import com.trainingapps.userms.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public String UserNotFoundHandler(UserNotFoundException e){
        return e.getMessage();
    }
}
