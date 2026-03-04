package com.example.security_project.controller;

import com.example.security_project.dto.Entity_Dto;
import com.example.security_project.entity.Entity_employee;
import com.example.security_project.service.Serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class Entity_controller {
    @Autowired
    private  final Serviceimpl serviceimpl;

    public Entity_controller(Serviceimpl serviceimpl)
    {
        this.serviceimpl=serviceimpl;
    }

    @GetMapping()
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public List<Entity_Dto> getproduct()
    {
        List<Entity_Dto> e1=serviceimpl.getallproducts();
        return e1;
    }

    @PostMapping()
    @PreAuthorize("hasAnyRole('ADMIN')")
   public  Entity_Dto savedproduct(@RequestBody Entity_Dto entityDto)
    {
        Entity_Dto e1=serviceimpl.createemployee(entityDto);
        return e1;

    }

    @PatchMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public Entity_Dto updateproduct(@PathVariable("id") Integer id ,@RequestBody Entity_Dto entity_dto)
    {
        Entity_Dto e1=serviceimpl.updateemployee(id,entity_dto);
        return  e1;

    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public String Deletebyid(@PathVariable("id") Integer id)
    {
        String  e1=serviceimpl.delete(id);
        return e1;
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public Entity_Dto getbyid(@PathVariable("id") Integer id)
    {
        Entity_Dto e1=serviceimpl.getemployeebyid(id);
        return e1;
    }
}
