package com.ards.simple.controllers;

import com.ards.simple.entities.User;
import com.ards.simple.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/signup")
    public User signUP(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("")
    public List<User> getAllUser() {
        return service.getAllUser();
    }

}
