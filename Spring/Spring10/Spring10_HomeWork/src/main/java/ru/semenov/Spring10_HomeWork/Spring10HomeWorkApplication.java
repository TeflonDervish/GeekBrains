package ru.semenov.Spring10_HomeWork;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.semenov.Spring10_HomeWork.model.Role;
import ru.semenov.Spring10_HomeWork.model.Session;
import ru.semenov.Spring10_HomeWork.model.Users;
import ru.semenov.Spring10_HomeWork.repository.UserRepository;

@SpringBootApplication
@AllArgsConstructor
public class Spring10HomeWorkApplication {


	public static void main(String[] args) {
		SpringApplication.run(Spring10HomeWorkApplication.class, args);
	}

}
