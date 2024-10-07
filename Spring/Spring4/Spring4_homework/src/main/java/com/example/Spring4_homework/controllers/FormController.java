package com.example.Spring4_homework.controllers;

import com.example.Spring4_homework.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {

    private User user;

    public FormController() {
        user = new User(

        );
    }

    @GetMapping
    public String getInformation(Model model) {
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping
    public String setInformation(User user, Model model) {
        this.user = user;
        model.addAttribute("user", this.user);
        return "form";
    }


}
