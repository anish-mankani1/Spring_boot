package org.s2p.main;

import org.s2p.beans.Vehicle;
import org.s2p.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        /*
           The var keyword was introduced in java 10. Type inference is used in var
           keyword in which it detects automatically the datatype of a variable based
           on the surrounding context.
         */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*
            This line throws a NoUniqueBeanDefinitionException because the IoC container
            contains multiple beans of type Vehicle. When a type-based lookup is performed
            without specifying a bean name or qualifier, Spring cannot determine which
            specific bean to inject, resulting in this exception.
        */
//        Vehicle veh = context.getBean(Vehicle.class);

        // Resolving NoUniqueBeanDefinitionException with improved lookup bean-name and Bean Type
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle Name From Spring Context : " + veh.getName());
    }
}
