package org.example1.looseCoupling;

public class Client
{
    public static void main(String[] args) {

        Traveller traveller = new Traveller();

        Car car = new Car();
        Bike bike = new Bike();
        BiCycle biCycle = new BiCycle();

        traveller.vehicle = car;
        traveller.travel();

        traveller.vehicle = bike;
        traveller.travel();

        traveller.vehicle = biCycle;
        traveller.travel();

    }
}
