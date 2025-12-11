package org.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

    private String name = "Toyota";

    // This is an example of circular dependency
    @Autowired
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Vehicle name is " + this.name;
    }

}