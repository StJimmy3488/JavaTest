package com.example.JavaTest.controller;

import com.example.JavaTest.service.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class ContractTypeController {
    @Autowired
    public ContractTypeService contractTypeService;

//    @GetMapping
//    public String listAllContracts(Model model) {
//        model.addAttribute("all_contracts2", contractTypeService.findAll());
//        return "contract";
//    }
}
