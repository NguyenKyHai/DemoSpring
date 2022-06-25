package com.example.webspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/home")
    public String getAllProducts(Model model) {
        model.addAttribute("message", "Hello");
        return "home";
    }
}
