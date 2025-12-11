package org.s2p.main;


import org.s2p.beans.Person;
import org.s2p.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person =  context.getBean(Person.class);
        System.out.println("Person Bean From Spring Context                  : " + person.getName());
        System.out.println("Vehicle Bean Owned By Person From Spring Context : " + person.getVehicle().getName());
        System.out.println("VehicleServices Bean Owned By Vehicle Bean       : " + person.getVehicle().getVehicleServices());
        System.out.println("Speaker Bean Owned By VehicleServices Bean       : " + person.getVehicle().getVehicleServices().getSpeaker().makeSound());
        System.out.println("Tyre Bean Owned By VehicleServices Bean          : " + person.getVehicle().getVehicleServices().getTyres().rotate());
    }
}
