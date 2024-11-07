package com.example.Spring8_HomeWork;

import com.example.Spring8_HomeWork.model.Users;
import com.example.Spring8_HomeWork.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring8HomeWorkApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring8HomeWorkApplication.class, args);
		UserService userService =context.getBean(UserService.class);

		System.out.println("Hello");

		Users user = userService.createUser("user", "password");
		userService.deleteUser(user.getId());

	}

}
