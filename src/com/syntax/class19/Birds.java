package com.syntax.class19;

/*
task:
Write a java class that will have a constructor:
one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
 */

public class Birds {

    String breed;
    int age;
    char gender;

    Birds(String breed, int age, char gender){
        System.out.println("Parameterized constructor:");
        this.breed=breed;
        this.age=age;
        this.gender=gender;
    }

    Birds(){
        System.out.println("Zero-argument constructor:");

    }

    void printInfo(){
        System.out.println(breed+", "+age+", "+gender);
    }

}
