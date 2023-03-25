package com.trainingapps.userms.service;

import com.trainingapps.userms.entity.User;
import com.trainingapps.userms.exception.UserNotFoundException;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    List<User> findAll() throws UserNotFoundException;
    User findById(int id) throws UserNotFoundException;
    void deleteUser(int id);

}
