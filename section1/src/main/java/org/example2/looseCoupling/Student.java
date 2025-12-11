package org.example2.looseCoupling;

public class Student
{
    Laptop laptop;

    public void startProject()
    {
        laptop.processor();
        laptop.display();
        laptop.os();
    }
}
