package ru.semenov.Spring10_HomeWork.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.semenov.Spring10_HomeWork.exceptions.PasswordIncorrect;
import ru.semenov.Spring10_HomeWork.exceptions.UserAlreadyLogin;
import ru.semenov.Spring10_HomeWork.exceptions.UserNotFound;
import ru.semenov.Spring10_HomeWork.exceptions.UserWithThatNameAlreadyExists;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<String> userNotFound(UserNotFound userNotFound){
        return new ResponseEntity<>(userNotFound.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PasswordIncorrect.class)
    public ResponseEntity<String> passwordIncorrect(PasswordIncorrect passwordIncorrect) {
        return new ResponseEntity<>(passwordIncorrect.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(UserWithThatNameAlreadyExists.class)
    public ResponseEntity<String> userWithThatNameAlreadyExists(UserWithThatNameAlreadyExists userWithThatNameAlreadyExists) {
        return new ResponseEntity<>(userWithThatNameAlreadyExists.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(UserAlreadyLogin.class)
    public ResponseEntity<String> userWithThatNameAlreadyExists(UserAlreadyLogin userAlreadyLogin) {
        return new ResponseEntity<>(userAlreadyLogin.getMessage(), HttpStatus.CONFLICT);
    }
}
