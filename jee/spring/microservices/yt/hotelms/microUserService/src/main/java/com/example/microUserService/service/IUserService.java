package com.example.microUserService.service;

import com.example.microUserService.entities.User;

import java.util.*;

public interface IUserService {
    User saveUser(User user);

    List<User> getAllUser();

    User findById(String id);

}
