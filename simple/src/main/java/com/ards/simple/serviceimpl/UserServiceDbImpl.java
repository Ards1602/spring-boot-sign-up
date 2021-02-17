package com.ards.simple.serviceimpl;

import com.ards.simple.entities.User;
import com.ards.simple.repositories.UserRepository;
import com.ards.simple.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceDbImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }
}
