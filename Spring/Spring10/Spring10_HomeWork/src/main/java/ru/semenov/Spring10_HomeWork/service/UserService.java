package ru.semenov.Spring10_HomeWork.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.semenov.Spring10_HomeWork.controller.AuthController;
import ru.semenov.Spring10_HomeWork.exceptions.PasswordIncorrect;
import ru.semenov.Spring10_HomeWork.exceptions.UserAlreadyLogin;
import ru.semenov.Spring10_HomeWork.exceptions.UserNotFound;
import ru.semenov.Spring10_HomeWork.exceptions.UserWithThatNameAlreadyExists;
import ru.semenov.Spring10_HomeWork.model.Role;
import ru.semenov.Spring10_HomeWork.model.Session;
import ru.semenov.Spring10_HomeWork.model.Users;
import ru.semenov.Spring10_HomeWork.repository.SessionRepository;
import ru.semenov.Spring10_HomeWork.repository.UserRepository;

import java.util.Optional;
import java.util.logging.Logger;

@Service
@Data
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private SessionRepository sessionRepository;

    private final Logger logger = Logger.getLogger(String.valueOf(AuthController.class));

    public Users login(String username, String password) {

        Users user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFound("Пользователя с таким логином не существует"));

        if (user.getPassword().equals(password)) {
            if (user.getSession() != null) throw new UserAlreadyLogin("Пользователь с таким логином уже в сети");
            Session newSession = new Session();
            sessionRepository.save(newSession);
            user.setSession(newSession);
            return user;
        }else {
            throw new PasswordIncorrect("Неправильный пароль");
        }

    }

    public Users register(Users user) {

        Optional<Users> userInSystem = userRepository.findByUsername(user.getUsername());

        if (userInSystem.isEmpty()) {

            Session newSession = new Session();
            sessionRepository.save(newSession);
            user.setRole(Role.USER);
            user.setSession(newSession);
            logger.info(user.toString());
            userRepository.save(user);
            return user;
        }else{
            throw new UserWithThatNameAlreadyExists("Пользователь с таким именем уже существует");
        }

    }

    public void logout(Long id) {

        Users user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFound("Пользователя с таким логином не существует"));

        user.setSession(null);
        userRepository.save(user);

    }


}
