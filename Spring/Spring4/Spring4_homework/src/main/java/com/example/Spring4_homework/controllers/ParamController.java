package com.example.Spring4_homework.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamController {



    @GetMapping("/{a}/{b}")
    public String params1(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int c = a + b;
        model.addAttribute("c", c);
        return "param";
    }

    @GetMapping("")
    public String params2(@RequestParam("a") int a, @RequestParam("b") int b, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int c = a + b;
        model.addAttribute("c", c);
        return "param";
    }
}
