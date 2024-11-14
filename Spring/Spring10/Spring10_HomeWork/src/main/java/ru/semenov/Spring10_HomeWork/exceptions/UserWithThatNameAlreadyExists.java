package ru.semenov.Spring10_HomeWork.exceptions;

public class UserWithThatNameAlreadyExists extends RuntimeException {
    public UserWithThatNameAlreadyExists(String message) {
        super(message);
    }
}
