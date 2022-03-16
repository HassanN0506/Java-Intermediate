package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="Alex";
        System.out.println(student.name);
        student.printName();

        student.id="A1";
        System.out.println(student.id);

        System.out.println("************************************");

        Principal pcpl = new Principal();
        pcpl.name = "Terry";
        pcpl.printName();
        pcpl.specialParkingSpot=true;
        pcpl.age=49;
        System.out.println(pcpl.age);
    }
}
