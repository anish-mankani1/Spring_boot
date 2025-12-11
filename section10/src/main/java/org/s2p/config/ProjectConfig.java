package org.s2p.config;

import org.s2p.beans.Person;
import org.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig
{
    /*
        Here in the below code, we are creating the Vehicle Bean by invoking the vehicle() bean method.
     */
    @Bean
    Vehicle vehicle()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }


    /*
        Here in the below code, we are trying to wire or establish a relationship between
        Person and Vehicle by invoking the vehicle() bean method from person() bean method.

        Spring will make sure to have only 1 vehicle bean is created and also Vehicle bean
        will be created first as person bean has dependency on it.
     */
    @Bean
    Person person()
    {
        Person person = new Person();
        person.setName("Steve Jobs");
        person.setVehicle(vehicle());
        return person;
    }
}