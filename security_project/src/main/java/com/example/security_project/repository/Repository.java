package com.example.security_project.repository;

import com.example.security_project.entity.Entity_employee;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<Entity_employee,Integer>{

}
