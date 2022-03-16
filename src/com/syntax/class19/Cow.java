package com.syntax.class19;

public class Cow {

    static int normalNumberOfLegs=4;
    //we leave it as default access modifier, because there's no need to keep it secret.

    private String name;
    int age;
    double weight;
    String breed;
    char gender;
    //When we don't assign any values to the instance fields, Java assigns default values to them
    /*
    name = null
    age = 0
    weight = 0.0
    breed = null

    objects = null !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! (objects are technically variables)
    boolean = false
    char = \u0000 (code that represents nothing in char)
     */


    /*
    the constructor that is provided AUTOMATICALLY,
     when we don't create any constructor in a class,
     is called the DEFAULT CONSTRUCTOR
     */

    //No-Argument AKA Zero-Argument Constructor:
    Cow(){
    /*
    You might want to execute some code to set up the resources for your class.
    Like opening the connections to database, checking if internet is available or not.
     */
    }

    //THIS IS NOT THE DEFAULT CONSTRUCTOR.
    //ONLY JAVA IS ABLE TO CREATE THE DEFAULT CONSTRUCTOR.
    //THIS IS SIMPLY ANOTHER ZERO-ARGUMENT CONSTRUCTOR
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //The 'default constructor' is only present when WE don't CREATE a constructor
    //'default constructor' can only be compiler-generated
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    //if we only create a parameterized constructor, then the default constructor will no longer exist
    // and THAT parameterized constructor that we created will ALWAYS be used to create an object
    // of that class (that shares the constructor's name; where the constructor is defined)


    void printName(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }


}
