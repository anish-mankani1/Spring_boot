package org.s2p.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello()
    {
        System.out.println("Printing Hello From Component Vehicle Bean");
    }

    @PostConstruct
    void initialize()
    {
        this.name = "Maclaren";
    }

    @PreDestroy
    void destroy()
    {
        this.name = null;
        System.out.println("Destroying The Vehicle Bean");
    }
}