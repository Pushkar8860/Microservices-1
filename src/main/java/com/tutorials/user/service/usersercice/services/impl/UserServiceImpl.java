package com.tutorials.user.service.usersercice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.user.service.usersercice.entities.User;
import com.tutorials.user.service.usersercice.exceptions.ResourceNotFpondException;
import com.tutorials.user.service.usersercice.repository.UserRepository;
import com.tutorials.user.service.usersercice.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAlluser() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFpondException("user Not Found : " + userId));
    }

}
