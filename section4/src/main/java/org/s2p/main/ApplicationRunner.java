package org.s2p.main;

import org.s2p.beans.Vehicle;
import org.s2p.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle ferrari     = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name From Spring Context : " + ferrari.getName());

        Vehicle audi        = (Vehicle) context.getBean("audiVehicle");
        System.out.println("Audi Vehicle From Spring Context : " + audi.getName());

        Vehicle mercedes    = context.getBean("mercedesVehicle", Vehicle.class);
        System.out.println("Mercedes Vehicle From Spring Context : " + mercedes.getName());
    }
}
