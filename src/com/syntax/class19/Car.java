package com.syntax.class19;

public class Car {

    String name="Toyota";
    String make;
    String color;
    String type;

    /*
        if we have same local and instance variable NAMES,
        java ALWAYS prefers the local variables inside a specific block of code (like a method)
        so java thinks you're trying to assign the local variable to ITSELF

        if you want to refer to the instance variable, we use "this" keyword
    */
    Car(String name, String make, String color, String type){
        //so, instead of name=name, we say:
        this.name=name;
        /*
        this.name is referring to the INSTANCE variables
        = is the assignment operator
        name is referring to the Parameter
         */
        this.make=make;
        this.color=color;
        this.type=type;

    }

    Car(){

    }

    void printCar(){
        String name="Tesla";
        //we're creating a NEW LOCAL variable called name
        System.out.println(name);
        //and printing it out (the Local variable)

        System.out.println(this.name);
        //when we print out the INSTANCE variable, it's still at its default (which we set to Toyota)
    }

}
