package org.example2.tightCoupling;

public class DellLaptop implements Laptop
{

    @Override
    public void processor() {
        System.out.println("Dell Laptop Processor");
    }

    @Override
    public void display() {
        System.out.println("Dell Laptop Display");
    }

    @Override
    public void os() {
        System.out.println("Dell Laptop Windows OS");
    }
}
