package org.s2p.beans;


import org.s2p.services.VehicleServices;

public class Vehicle {

    private String name = "Toyota";
    private VehicleServices vehicleServices;

    public Vehicle()
    {
        this.vehicleServices = new VehicleServices();
        System.out.println("Vehicle Bean Created By User");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    @Override
    public String toString() {
        return "Vehicle name is " + this.name;
    }

}