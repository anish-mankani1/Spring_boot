package org.example2.looseCoupling;

public class Client
{
    public static void main(String[] args) {

        Student student = new Student();
        student.laptop = new DellLaptop();

        student.startProject();
    }
}
