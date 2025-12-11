package org.s2p.main;

import org.s2p.beans.Person;
import org.s2p.beans.Vehicle;
import org.s2p.interfaces.Speaker;
import org.s2p.interfaces.Tyres;
import org.s2p.services.VehicleServices;

public class ApplicationRunner {

    public static void main(String[] args)
    {
        Person person = new Person();
        System.out.println("Person Instance From Heap : " + person.getName());
        System.out.println("Vehicle Instance Owned By Person : " + person.getVehicle());

        Vehicle vehicle = person.getVehicle();
        VehicleServices vehicleServices = vehicle.getVehicleServices();

        Tyres tyres = vehicleServices.getTyres();
        Speaker speaker = vehicleServices.getSpeaker();

        System.out.println("Vehicle Instance Tyre Services      : " + tyres.rotate());
        System.out.println("Vehicle Instance Speaker Services   : " + speaker.makeSound());

        System.out.println("Vehicle Instance Tyre Services      : " + person.getVehicle().getVehicleServices().getTyres().rotate());
        System.out.println("Vehicle Instance Speaker Services   : " + person.getVehicle().getVehicleServices().getSpeaker().makeSound());
    }
}
