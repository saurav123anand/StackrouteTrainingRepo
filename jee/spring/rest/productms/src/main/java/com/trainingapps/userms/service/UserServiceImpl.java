package com.trainingapps.userms.service;

import com.trainingapps.userms.dao.UserRepository;
import com.trainingapps.userms.entity.User;
import com.trainingapps.userms.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository repository;
    @Override
    public User addUser(User user) {
        User addedUser=repository.save(user);
        return addedUser;
    }

    @Override
    public List<User> findAll() throws UserNotFoundException {
        List<User> users=repository.findAll();
        if(users.size()==0){
            throw new UserNotFoundException("No user found");
        }
        return users;
    }

    @Override
    public User findById(int id) throws UserNotFoundException {
        Optional<User> user=repository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException("user not found for id "+id);
        }
        return user.get();
    }

    @Override
    public void deleteUser(int id) {
       repository.deleteById(id);
    }
}
