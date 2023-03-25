package com.example.userService.controller;

import com.example.userService.entities.User;
import com.example.userService.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService service;

    @PostMapping("/createuser")
    public User createUser(@RequestBody User user){
       return service.saveUser(user);
    }
    @GetMapping("/findbyid/{userId}")
    public User findById(@PathVariable String userId){
       return service.findById(userId);
    }
    @GetMapping("/findall")
    public List<User> findAll(){
        return service.getAllUser();
    }



}
