package org.example2.looseCoupling;

public class HpLaptop implements Laptop
{
    @Override
    public void processor()
    {
        System.out.println("HP Laptop Processor");
    }

    @Override
    public void display()
    {
        System.out.println("HP Laptop Display");
    }

    @Override
    public void os()
    {
        System.out.println("HP Laptop Windows OS");
    }
}
