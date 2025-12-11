package org.example2.tightCoupling;

public class Client
{
    public static void main(String[] args) {

        Student student = new Student();
        student.hpLaptop = new HpLaptop();

        student.startProject();
    }
}
