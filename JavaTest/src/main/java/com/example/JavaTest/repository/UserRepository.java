package com.example.JavaTest.repository;

import com.example.JavaTest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
