package com.example.hotelService.controller;

import org.apache.catalina.LifecycleState;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {

    @GetMapping
    private ResponseEntity<List<String>> getStaffs(){
        List<String> staffs= Arrays.asList("Ram","Shyam","Scooby");
        return new ResponseEntity<>(staffs, HttpStatus.OK);
    }

}
