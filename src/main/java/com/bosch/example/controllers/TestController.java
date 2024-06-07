package com.bosch.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bosch.example.dto.User;

@RestController //indica para o Spring que é um controller que ele deve considerar
public class TestController {
    
    @GetMapping("/test") 
    public User test(@RequestBody User user) {
        if (user.name() == null) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "name is missing."
            );
        } else if (user.name().length() < 7) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "name is too short."
            );
        } else if (!user.name().matches("[a-zA-Z]+")) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "only use letters"
            );
        }
        return user;
    }
    // @GetMapping("/test") 
    // public Integer test(Integer a, Integer b) {
    //     return a + b;
    // }
}