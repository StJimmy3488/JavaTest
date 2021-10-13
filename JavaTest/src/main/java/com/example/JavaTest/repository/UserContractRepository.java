package com.example.JavaTest.repository;

import com.example.JavaTest.model.UserContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContractRepository extends JpaRepository<UserContract, Long> {
}
