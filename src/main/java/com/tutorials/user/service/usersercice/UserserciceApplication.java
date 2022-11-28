package com.tutorials.user.service.usersercice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserserciceApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserserciceApplication.class, args);
	}

}
