package com.syntax.class19;

public class Panda {
    String name = "Po";
    String breed = "Red-tailed";
    String color;
    int age = 30;
    double height = 5.0;
    double weight = 300.0;

    Panda(String pName) {
        name = pName;
    }

    Panda(String pName,String pColor, int pAge) {
        name = pName;
        color = pColor;
        age = pAge;
    }

    Panda(String pName, String pBreed, String pColor, int pAge, double pHeight, double pWeight) {
        name = pName;
        breed = pBreed;
        color = pColor;
        age = pAge;
        height = pHeight;
        weight = pWeight;
    }

    //zero-argument constructor:
    //we have to EXPLICITLY make it, because we've created at least 1 other constructor
    Panda(){

    }
    //Now, we can create a new Object and the assign the specific fields any value we want AFTER.
    //Otherwise, their default values we've set above, when we initialized, will remain for those Objects.


    void printInfo() {
        System.out.println(name + " " + breed + " " + color + " " + height + " " + age + " " + weight);
    }

}
