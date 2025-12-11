package org.s2p.config;

import org.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
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
        When you have multiple beans of the same kind inside Spring Context,
        you can make one of them primary by using @Primary annotation.
        The primary bean is that one which Spring will choose if it has multiple
        options, and you don't specify a name. In other words, it is the default
        bean that Spring Context will consider in case of confusion due to multiple
        beans present of same type.
     */
    @Primary
    @Bean("ferrariVehicle")
    Vehicle vehicle1()
    {
        Vehicle ferrari = new Vehicle();
        ferrari.setName("Ferrari Italia 458");
        return ferrari;
    }

    @Bean("audiVehicle")
    Vehicle vehicle2()
    {
        Vehicle audi = new Vehicle();
        audi.setName("Audi R8");
        return audi;
    }

    @Bean("mercedesVehicle")
    Vehicle vehicle3()
    {
        Vehicle mercedes = new Vehicle();
        mercedes.setName("Mercedes S Class");
        return mercedes;
    }
}