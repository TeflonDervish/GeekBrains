package com.example.Spring4_2.contollers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RandomController {

    @Value("${data.parameter.min:25}")
    private Integer minDefault;
    @Value("${data.parameter.max:100}")
    private Integer maxDefault;

    @GetMapping("/random/{min}/{max}")
    public String getRandomNumber(@PathVariable int min, @PathVariable int max, Model model) {
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("min_default", minDefault);
        model.addAttribute("max_default", maxDefault);
        model.addAttribute("number", new Random().nextInt(min, max));
        return "random.html";
    }

    @GetMapping("/random")
    public String getRandomNumber1(@RequestParam("min") Integer min,
                                  @RequestParam("max") Integer max, Model model) {
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("min_default", minDefault);
        model.addAttribute("max_default", maxDefault);
        model.addAttribute("number", new Random().nextInt(min, max));
        return "random.html";
    }



}
