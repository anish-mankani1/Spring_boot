package org.example1.tightCoupling;

public class Traveller
{
    private Car car = new Car();

    public void travel()
    {
        car.start();
    }

}
