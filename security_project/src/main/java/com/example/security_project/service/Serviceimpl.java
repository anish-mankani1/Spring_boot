package com.example.security_project.service;

import com.example.security_project.dto.Entity_Dto;
import com.example.security_project.entity.Entity_employee;
import com.example.security_project.repository.Repository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Serviceimpl {
    @Autowired
    private final Repository repository;

    public Serviceimpl(Repository repository)
    {
        this.repository=repository;
    }



    public  List<Entity_Dto> getallproducts()
    {
        List<Entity_employee> e1=repository.findAll();
      List  <Entity_Dto> e2=new ArrayList<>();
      for(int i=0;i<e1.size();i++)
      {
          Entity_Dto e3=new Entity_Dto();
          BeanUtils.copyProperties(e1.get(i),e3);
          e2.add(e3);

      }
      return e2;
    }
    public Entity_Dto createemployee(Entity_Dto employeedto)
    {
        Entity_employee e1=new Entity_employee();
        BeanUtils.copyProperties(employeedto,e1);
        Entity_employee e2=repository.save(e1);
        Entity_Dto e3=new Entity_Dto();
        BeanUtils.copyProperties(e2,e3);
        return e3;
    }
   public   Entity_Dto updateemployee(Integer id ,Entity_Dto employeedto)
    {
        Optional<Entity_employee> e1=repository.findById(id);
        if(e1.isPresent())
        {
            Entity_employee e2=e1.get();
            if(employeedto.getName()!=null)
            {
                e2.setName(employeedto.getName());
            }
            if(employeedto.getDepartment()!=null)
            {
                e2.setDepartment(employeedto.getDepartment());
            }
            if(employeedto.getSalary()!=null)
            {
                e2.setSalary(employeedto.getSalary());
            }
            if(employeedto.getEmail()!=null)
            {
                e2.setEmail(employeedto.getEmail());
            }
            Entity_employee e5=repository.save(e2);
           Entity_Dto e4=new Entity_Dto();
            BeanUtils.copyProperties(e5,e4);
            return e4;
        }
        return null;
    }
    public String delete(Integer id)
    {
        Optional<Entity_employee> e1=repository.findById(id);
        if(e1.isPresent())
        {
            repository.deleteById(id);
            return "id has been deleted" +id;

        }
        else {
            return "id is not present " + id;
        }
    }
 public   Entity_Dto getemployeebyid(Integer id )
    {
        Optional<Entity_employee> e1=repository.findById(id);
        if(e1.isPresent())
        {
            Entity_Dto e2=new Entity_Dto();
            BeanUtils.copyProperties(e1.get(),e2);
            return e2;
        }
        else {
            throw new RuntimeException("id is not present ");
        }
    }
}
