package com.example.Spring3_home.controllers;

import com.example.Spring3_home.domain.User;
import com.example.Spring3_home.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        System.out.println("Hello");
        return service.getDataProcessingService().getUserRepository().getUsers();
    }

    @PostMapping
    public String userAddFromBody(@RequestBody User user){
        System.out.println("service = " + service);
        service.getDataProcessingService().addUserToList(user);
        return "User add successfully";
    }
}
