package com.bosch.example.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.bosch.example.model.User;
import com.bosch.example.repositories.UserJPARepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    UserJPARepository repo;
    
    
    @PostMapping("/user")
    public String postUser(@RequestBody User user) {

        repo.save(user);
        
        return "user created with sucess!";
    }
}
