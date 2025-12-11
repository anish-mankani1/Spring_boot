package org.s2p.main;


import org.s2p.beans.Person;
import org.s2p.config.ProjectConfig;
import org.s2p.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the person bean from the Spring Context");

    }
}
