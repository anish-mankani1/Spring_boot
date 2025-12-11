package org.s2p.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "Toyota";

    public Vehicle()
    {
        System.out.println("Vehicle Bean Created By Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is " + this.name;
    }

}