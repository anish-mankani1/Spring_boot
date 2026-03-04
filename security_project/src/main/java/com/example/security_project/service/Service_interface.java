package com.example.security_project.service;

import com.example.security_project.dto.Entity_Dto;

import java.util.List;

public interface Service_interface {

    public abstract List<Entity_Dto> getallproducts();

    Entity_Dto createemployee(Entity_Dto employeedto);

    Entity_Dto updateemployee(Long id, Entity_Dto employeedto);

    String delete(Integer id);

    Entity_Dto getemployeebyid(Integer id);
}