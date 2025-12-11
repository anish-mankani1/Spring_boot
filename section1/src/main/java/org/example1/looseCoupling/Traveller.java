package org.example1.looseCoupling;

public class Traveller
{
    IVehicle vehicle;

    public void travel()
    {
        vehicle.start();
    }
}
