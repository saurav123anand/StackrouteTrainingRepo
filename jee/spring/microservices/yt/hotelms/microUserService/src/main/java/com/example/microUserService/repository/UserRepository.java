package com.example.microUserService.repository;

import com.example.microUserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,String> {
}
