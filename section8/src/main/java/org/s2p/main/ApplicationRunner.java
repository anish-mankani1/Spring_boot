package org.s2p.main;

import org.s2p.beans.Vehicle;
import org.s2p.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context : " + vehicle.getName());
    }
}
