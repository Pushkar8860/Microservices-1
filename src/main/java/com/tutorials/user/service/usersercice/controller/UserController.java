package com.tutorials.user.service.usersercice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorials.user.service.usersercice.entities.User;
import com.tutorials.user.service.usersercice.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/create-user")
    public ResponseEntity<?> createuser(@RequestBody User user) {
        User user1 = userServices.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/get-user/{userId}")
    public ResponseEntity<?> getUser(@PathVariable String userId) {
        User user1 = userServices.getUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }

    @GetMapping("/get-all-users")
    public ResponseEntity<?> getAllUser() {
        List<User> alluser = userServices.getAlluser();
        return ResponseEntity.status(HttpStatus.OK).body(alluser);
    }
}
