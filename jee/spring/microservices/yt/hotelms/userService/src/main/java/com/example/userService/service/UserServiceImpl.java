package com.example.userService.service;

import com.example.userService.entities.User;
import com.example.userService.repository.UserRepository;
import com.example.userService.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository repository;
    @Override
    public User saveUser(User user) {
        String randomUserId= UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        User added=repository.save(user);
        return added;
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    public User findById(String id) {
        return repository.findById(id).orElseThrow(()->new UserNotFoundException("user not found for id "+id));
    }
}
