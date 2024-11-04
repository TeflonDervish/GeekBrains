package com.example.Spring7_HomeWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/public-data")
    public String publicData() {
        return "This is public data.";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "This is private data. Only for admins!";
    }
}
