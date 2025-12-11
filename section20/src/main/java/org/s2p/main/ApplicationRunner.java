package org.s2p.main;


import org.s2p.beans.Person;
import org.s2p.config.ProjectConfig;
import org.s2p.interfaces.Speaker;
import org.s2p.interfaces.Tyres;
import org.s2p.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);

        Speaker speaker = vehicleServices.getSpeaker();
        Tyres   tyres   = vehicleServices.getTyres();

        vehicleServices.playMusic();
        vehicleServices.moveVehicle();

        System.out.println(speaker.makeSound());
        System.out.println(tyres.rotate());
    }
}
