package org.example2.tightCoupling;

public class AppleLaptop implements Laptop
{

    @Override
    public void processor() {
        System.out.println("Apple Laptop Processor");
    }

    @Override
    public void display() {
        System.out.println("Apple Laptop Display");
    }

    @Override
    public void os() {
        System.out.println("Apple Laptop OS");
    }
}
