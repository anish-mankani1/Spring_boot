package org.s2p.main;

import org.s2p.beans.Vehicle;
import org.s2p.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class ApplicationRunner {
    public static void main(String[] args)
    {

        Supplier<Vehicle> bmwSupplier = new Supplier<Vehicle>() {
            @Override
            public Vehicle get() {
                Vehicle vehicle = new Vehicle();
                vehicle.setName("BMW M-2");
                return vehicle;
            }
        };

        Supplier<Vehicle> astonMartinSupplier = new Supplier<Vehicle>() {
            @Override
            public Vehicle get() {
                Vehicle vehicle = new Vehicle();
                vehicle.setName("Aston Martin DB-12");
                return vehicle;
            }
        };

        Random random = new Random();

        int randomNumber = random.nextInt(12,1000);
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Random number is even then add Bmw bean inside Spring Context
        if(randomNumber % 2 == 0)
        {
            context.registerBean("bmwSupplier",Vehicle.class, bmwSupplier);
        }
        else
        {
            context.registerBean("astonMartinSupplier",Vehicle.class, astonMartinSupplier);
        }

        Vehicle bmwVehicle = null;
        Vehicle astonMartinVehicle = null;

        try
        {
            bmwVehicle = context.getBean("bmwSupplier",Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException exception)
        {
            System.out.println("Error while fetching the BMW Bean");
        }

        try
        {
            astonMartinVehicle = context.getBean("astonMartinSupplier", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException exception)
        {
            System.out.println("Error while fetching the Aston Martin Bean");
        }

        if(null != bmwVehicle)
        {
            System.out.println("Programmatically added vehicle bean name from Spring Context : " + bmwVehicle.getName());
        }
        else
        {
            System.out.println("Programmatically added vehicle bean name from Spring Context : " + astonMartinVehicle.getName());
        }
        context.close();
    }
}
