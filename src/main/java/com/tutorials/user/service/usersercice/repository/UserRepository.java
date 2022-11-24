package com.tutorials.user.service.usersercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.user.service.usersercice.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
