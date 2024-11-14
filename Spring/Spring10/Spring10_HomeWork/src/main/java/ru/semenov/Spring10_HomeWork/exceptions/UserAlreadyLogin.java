package ru.semenov.Spring10_HomeWork.exceptions;

public class UserAlreadyLogin extends RuntimeException {
    public UserAlreadyLogin(String message) {
        super(message);
    }
}
