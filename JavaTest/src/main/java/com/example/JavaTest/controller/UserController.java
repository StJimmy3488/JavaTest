package com.example.JavaTest.controller;

import com.example.JavaTest.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @GetMapping
    public String listAllUsers(Model model) {
        model.addAttribute("all_users", userService.findAll());
        return "users";
    }

}
