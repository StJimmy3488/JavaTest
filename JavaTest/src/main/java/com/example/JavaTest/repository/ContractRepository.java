package com.example.JavaTest.repository;

import com.example.JavaTest.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {


//    List<Contract> findByContractType(String contractType);

}
