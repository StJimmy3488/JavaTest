package com.example.JavaTest.service;

import com.example.JavaTest.model.Contract;
import com.example.JavaTest.repository.ContractRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ContractService {
    private final ContractRepository contractRepository;

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }
//    public List<Contract> findByName() {
//        return contractRepository.findByContractType(Contract contract) {
//
//        }
//    }
}
