package org.s2p.main;

import org.s2p.beans.Vehicle;
import org.s2p.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from Spring Context is : " + vehicle.getName());
        vehicle.printHello();
    }
}
