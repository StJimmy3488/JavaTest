package com.example.JavaTest.repository;

import com.example.JavaTest.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Long> {


    List<Contract> findByContractType(String contractType);

}
