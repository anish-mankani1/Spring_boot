package org.s2p.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person
{
    private String name = "Steve Jobs";
    private Vehicle vehicle;

    // Constructor Based Autowiring
    @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        System.out.println("Person Bean Created By Spring ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
