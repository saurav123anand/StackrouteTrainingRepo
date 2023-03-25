package com.trainingapps.userms.controller;

import com.trainingapps.userms.entity.User;
import com.trainingapps.userms.exception.UserNotFoundException;
import com.trainingapps.userms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private IUserService service;

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User response=service.addUser(user);
        return new ResponseEntity<User>(response,HttpStatus.CREATED);
    }
    @GetMapping("/findbyid/{id}")
    public ResponseEntity<User> findUserById(@PathVariable int id){
        try {
            User response = service.findById(id);
            return new ResponseEntity<User>(response, HttpStatus.OK);

        }
        catch (UserNotFoundException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/findall")
    public ResponseEntity<List<User>> findAllUser(){
        try {
            List<User> response = service.findAll();
            return new ResponseEntity<List<User>>(response,HttpStatus.OK);
        }
        catch (UserNotFoundException e){
           return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }
    }


}
