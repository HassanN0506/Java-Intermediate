package com.syntax.reviewClass9;

public class Doctor {

    String firstName, lastName, speciality;
    static String hospital = "George Washington";

    private double salary;

    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Constructor #1 w/ first and last name");
    }
    //overloading constructors
    public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
        System.out.println("Constructor #2 w/ specialty as well as first and last name");
    }
    //2nd constructor calls the 1st constructor FIRST within itself, and then ADDS on to it.

    //static members can access only static variables
    static void work(){
        System.out.println("All doctors work at "+hospital);
    }

    //non-static methods can access BOTH static and non-static members
    void work1(){
        System.out.println("All doctors work at "+hospital);
    }

    //static methods cannot access non-static members(variables or methods)
    void printInfo(){
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality+" at "+hospital);
    }

    void printInfoAndHello(){
        System.out.println("Hello,");
        this.printInfo();
    }
    /*
    "this" keyword is automatically added here when we call a method inside another method of the same class
     */

    private void getsPaid(){
        System.out.println("Doctor "+lastName+" gets paid "+salary);
    }

}

class Hospital {
    public static void main(String[] args) {

        //with the DEFAULT constructor:
//        Doctor doc1 = new Doctor();
//        System.out.println(doc1.firstName);
//        //output is null for all the instance variables

        Doctor doc2 = new Doctor("John", "Smith");
        doc2.printInfo();

        System.out.println();

        Doctor doc3 = new Doctor("Jane", "Doe", "SURGEON");
        doc3.printInfo();

        System.out.println("-------------------------------------");

        doc3.speciality = "NURSE"; //changing value of instance variable

        doc2.printInfo();
        doc3.printInfo();
        //it effected only the value of THAT instance

        System.out.println("-----------------------------");

        doc3.hospital = "INOVA"; //changing value of STATIC variable

        doc2.printInfo();
        doc3.printInfo();
        //it effected only the value of EVERY instance

        System.out.println("------------------------------");

        //doc3.salary=200000;
        //salary is private

        //doc3.getsPaid();
        //getsPaid is private

        //---------------------------------------------------------------


    }
}
