package com.example.userms.service;

import com.example.userms.entity.MyUserDetails;
import com.example.userms.entity.User;
import com.example.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user=repository.findByUsername(username);
        if(!user.isPresent()){
            throw new UsernameNotFoundException("user not found");
        }
        return new MyUserDetails(user.get());
    }
}
