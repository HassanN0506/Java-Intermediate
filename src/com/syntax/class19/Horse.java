package com.syntax.class19;

public class Horse {

    //it is very good practice to make the fields private,
    // and access them through methods and constructors
    private String name;
    private int age;
    private double weight;

    //purpose of constructor is to give initial value to the fields of a class
    Horse(String horseName, int horseAge, double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
    /* rule no1:
    Constructors don't have return types, not even Void.
    if we put a return type with Constructor, it wil then be treated as a Method.
    */
    /* rule no2:
    Name of the constructor should be the same as the name of the Class
     */

    //No-argument constructor AKA Zero-Argument constructor:
    Horse(){ //no parameters passed
        //write some important lines of code that you want
        // to execute WHEN the Object of a class is created
        /*
        for example,
        you might want to fetch some info from internet or your hard-drive,
        to give initial values to the fields.
        In which case, the fields won't be initialized by passing an argument,
        but by implicitly initializing.
         */
    }

    void printHorseName(){
        System.out.println("Name: "+name);
    }

    void setName(String horseName){
        name=horseName;
    }

}
