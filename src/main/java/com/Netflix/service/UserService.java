package com.Netflix.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Netflix.model.User;
import com.Netflix.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // Register
    public String register(User user) {
        repo.save(user);
        return "User Registered Successfully";
    }

    // Login
    public String login(User user) {
        User existing = repo.findByEmail(user.getEmail());

        if(existing == null) {
            return "User not found";
        }

        if(existing.getPassword().equals(user.getPassword())) {
            return "Login Successful";
        } else {
            return "Wrong Password";
        }
    }
}
