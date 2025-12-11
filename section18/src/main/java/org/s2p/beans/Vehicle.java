package org.s2p.beans;


import org.s2p.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {

    private String name = "Toyota";
    private VehicleServices vehicleServices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    @Autowired
    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
        System.out.println("Setter Method Called By Spring Core Framework");
    }

    @Override
    public String toString() {
        return "Vehicle name is " + this.name;
    }

}