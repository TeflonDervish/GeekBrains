package com.example.Spring3_2.HelloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/chao")
    public String chao() {
        return "Chao cacao!";
    }
}
