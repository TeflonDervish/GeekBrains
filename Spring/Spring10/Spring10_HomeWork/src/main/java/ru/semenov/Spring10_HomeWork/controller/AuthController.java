package ru.semenov.Spring10_HomeWork.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.semenov.Spring10_HomeWork.model.Session;
import ru.semenov.Spring10_HomeWork.model.Users;
import ru.semenov.Spring10_HomeWork.service.UserService;

import java.util.logging.Logger;

@RestController
@Data
@AllArgsConstructor
public class AuthController {

    private UserService userService;

    private final Logger logger = Logger.getLogger(String.valueOf(AuthController.class));

    @GetMapping("/login")
    public ResponseEntity<Session> login(@RequestParam(name="username") String username, @RequestParam(name="password") String password) {
        return new ResponseEntity<>(userService.login(username, password).getSession(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Session> register(@RequestBody Users user) {
        return new ResponseEntity<>(userService.register(user).getSession(), HttpStatus.CREATED);
    }

    @GetMapping("/logout")
    public ResponseEntity<Void> logout(@RequestParam(name="id") Long id) {
        userService.logout(id);
        return ResponseEntity.ok().build();
    }


}
