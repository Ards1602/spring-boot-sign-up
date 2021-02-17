package com.ards.simple.services;

import com.ards.simple.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> getAllUser();

}
