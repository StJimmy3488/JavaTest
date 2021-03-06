package com.example.JavaTest.controller;

import com.example.JavaTest.service.ContractService;
import com.example.JavaTest.service.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class ContractController {
    @Autowired
    public ContractService contractService;
    @Autowired
    public ContractTypeService contractTypeService;

    @GetMapping("/all_contracts")
    public String listAllContracts(Model model) {
        model.addAttribute("all_contracts", contractService.findAll());
        model.addAttribute("all_contract_types", contractTypeService.findAll());
        return "contract";

    }

}

