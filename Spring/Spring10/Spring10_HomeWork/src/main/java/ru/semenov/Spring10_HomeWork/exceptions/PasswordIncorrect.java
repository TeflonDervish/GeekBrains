package ru.semenov.Spring10_HomeWork.exceptions;

public class PasswordIncorrect extends RuntimeException {
    public PasswordIncorrect(String message) {
        super(message);
    }
}
