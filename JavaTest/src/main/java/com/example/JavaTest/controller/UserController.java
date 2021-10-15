package com.example.JavaTest.controller;

import com.example.JavaTest.model.User;
import com.example.JavaTest.service.UserService;
import com.example.JavaTest.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserTypeService userTypeService;


    @GetMapping
    public String listAllUsers(Model model) {
        model.addAttribute("all_users", userService.findAll());
        model.addAttribute("all_users_types", userTypeService.findAll());
        return "contract";
    }
    @GetMapping("/add_user")
    public String addNewUser(@ModelAttribute("user") User user) {
        return "add_contract";
    }
    @PostMapping()
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "add_contract";
        userService.saveUser(user);
        return "redirect:/contract";
    }
}
