package com.Netflix.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Netflix.model.User;
import com.Netflix.service.UserService;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    // REGISTER API
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return service.register(user);
    }

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return service.login(user);
    }
}
