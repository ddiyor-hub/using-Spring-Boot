package com.diyor.secure.controller;

import com.diyor.secure.model.Users;
import com.diyor.secure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        userService.register(user);
        return user;
    }
    @PostMapping("/login")
    public String login(@RequestBody Users users) {

        return userService.verify(users);
    }



}
