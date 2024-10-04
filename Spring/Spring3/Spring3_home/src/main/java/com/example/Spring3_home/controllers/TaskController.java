package com.example.Spring3_home.controllers;

import com.example.Spring3_home.domain.User;
import com.example.Spring3_home.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");

        return tasks;
    }

    @GetMapping("/sort")
    public List<User> sortUsersByAge() {
        return service.sortUsersByAge(service.getUserRepository().getUsers());
    }

    @GetMapping("/filter/{age}")
    public List<User> filterUsersByAge(@PathVariable int age) {
        return service.filterUsersByAge(service.getUserRepository().getUsers(), age);
    }

    @GetMapping("/calc")
    public double calculateAverageAge() {
        return service.calculateAverageAge(service.getUserRepository().getUsers());
    }

}
