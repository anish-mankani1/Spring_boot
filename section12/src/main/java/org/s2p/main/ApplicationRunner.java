package org.s2p.main;

import org.s2p.beans.Person;
import org.s2p.beans.Vehicle;
import org.s2p.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person   = context.getBean(Person.class);

        System.out.println("Person name from Spring Context is : " + person.getName());
        System.out.println("Vehicle name from Spring Context is : " + vehicle.getName());
        System.out.println("Vehicle that person owns is : " + person.getVehicle());
    }
}
