package com.example.JavaTest.service;

import com.example.JavaTest.model.ContractType;
import com.example.JavaTest.repository.ContractTypeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ContractTypeService {
    private final ContractTypeRepository contractTypeRepository;

    public List<ContractType> findAll() {
        return contractTypeRepository.findAll();
    }

}
