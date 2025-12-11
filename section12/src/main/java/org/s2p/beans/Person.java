package org.s2p.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String name = "Steve Jobs";

//    @Autowired
    private Vehicle vehicle;

    /*
     The @Autowired annotation marks on a field, setter method and constructor method
     is used to auto-wire the beans that is 'Injecting Beans' (Objects) at runtime
     by Spring Dependency Injection mechanism.

     Spring team recommends to use constructor based dependency injection.
     * */
    @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
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

//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        System.out.println("Setter Method Called");
        this.vehicle = vehicle;
    }


}
