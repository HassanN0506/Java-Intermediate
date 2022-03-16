package com.syntax.class20;

public class Frog {
    String name;
    String colors;
    int age;
    double weight;

    public Frog(String name, String colors,
                int age) {
        this.name = name;
        this.colors = colors;
        this.age = age;
        weight=10;
        //when there is no local variable w/ the same name
        //no need for "this" keyword.
    }

    public Frog(String name, String colors,
                int age, double weight) {
        this(name, colors, age);
        //this() should be the first line inside a constructor
        //when constructor chaining, the link must be the 1st line!!!!!!
        this.weight = weight;
    }

    void printInfo(){
        //this() not allowed inside a method
        //CONSTRUCTOR chaining can only happen inside constructors
        System.out.println(name+" "+colors+" "+
                age+" "+weight);
    }
}
