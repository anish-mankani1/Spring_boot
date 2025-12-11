package org.s2p.config;

import org.s2p.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    @Bean annotation, which lets Spring know that it need to call this method
    when it initializes it's context and adds the returned value to the context.
     */
    @Bean
    Vehicle vehicle1()
    {
        Vehicle ferrari = new Vehicle();
        ferrari.setName("Ferrari Italia 458");
        return ferrari;
    }

    @Bean
    Vehicle vehicle2()
    {
        Vehicle audi = new Vehicle();
        audi.setName("Audi R8");
        return audi;
    }

    @Bean
    Vehicle vehicle3()
    {
        Vehicle mercedes = new Vehicle();
        mercedes.setName("Mercedes S Class");
        return mercedes;
    }
}