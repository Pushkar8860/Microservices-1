package com.tutorials.user.service.usersercice.services;

import java.util.List;

import com.tutorials.user.service.usersercice.entities.User;

public interface UserServices {

    User save(User user);

    List<User> getAlluser();

    User getUser(String userId);

}
