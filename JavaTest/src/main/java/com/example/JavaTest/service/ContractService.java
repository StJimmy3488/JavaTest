package com.example.JavaTest.service;

import com.example.JavaTest.repository.ContractRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ContractService {
    private final ContractRepository contractRepository;

//    public List<Contract> findAll() {
//        return contractRepository.findAll();
//    }
//    public List<Contract> findByName() {
//        return contractRepository.findByContractType(Contract contract) {
//
//        }
//    }
}
