package com.example.security_project.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface User_interface extends JpaRepository<user,Long> {
    Optional<user> findByUsername(String username);
}
