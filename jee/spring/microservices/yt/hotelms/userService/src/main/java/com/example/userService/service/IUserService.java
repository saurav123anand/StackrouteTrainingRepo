package com.example.userService.service;

import com.example.userService.entities.User;

import java.util.*;

public interface IUserService {
    User saveUser(User user);

    List<User> getAllUser();

    User findById(String id);

}
