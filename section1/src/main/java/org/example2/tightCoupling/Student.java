package org.example2.tightCoupling;

public class Student
{
    HpLaptop hpLaptop;

    public void startProject()
    {
        hpLaptop.processor();
        hpLaptop.display();
        hpLaptop.os();
    }
}
