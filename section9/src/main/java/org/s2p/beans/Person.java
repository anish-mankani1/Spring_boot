package org.s2p.beans;

public class Person
{
    private String name;
    private Vehicle vehicle;

    // No-Args Constructor
    public Person()
    {
        System.out.println("Person Bean created by Spring");
    }

    // Getters And Setters
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
}
