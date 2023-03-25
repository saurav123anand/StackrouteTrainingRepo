package com.example.microUserService.controller;

import com.example.microUserService.entities.User;
import com.example.microUserService.service.IUserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    @CircuitBreaker(name = "ratingHotelBreaker",fallbackMethod = "ratingHotelFallback")
    public User findById(@PathVariable String userId){
       return service.findById(userId);
    }
    public User ratingHotelFallback(String userId,Exception e){
        System.out.println("fallback is executed because service is down "+e.getMessage());
        User user=new User();
        user.setEmail("dummy@gmail.com");
        user.setName("dummy");
        user.setAbout("this user is created dummy because some service id down");
        user.setUserId("12345");
        return user;
    }
    @GetMapping("/findall")
    public List<User> findAll(){
        return service.getAllUser();
    }


}
