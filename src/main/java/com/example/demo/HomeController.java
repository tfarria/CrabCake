package com.example.demo;

import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showRecipe(){
        return "crabbypage";
    }
}
