package org.s2p.beans;


public class Person
{
    private String name = "Steve Jobs";
    private Vehicle vehicle;

    public Person()
    {
        this.vehicle = new Vehicle();
        System.out.println("Person Bean Created By User");
    }

    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
