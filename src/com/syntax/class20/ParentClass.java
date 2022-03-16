package com.syntax.class20;

public class ParentClass {
    private String name;
    //private members don't participate in inheritance
    int age;
    protected double weight;
    public String color;
}

class ChildClass extends ParentClass{
    void printInfo(){
        //System.out.println(name);
        //cannot access name, because it's private, and this is another class
        //inheritance does NOT overrule the private access modifier!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println(age);
        //available, because default is accessible to a class in the SAME package

        System.out.println(weight);
        //available, because it's protected, and we're inside the same class THROUGH INHERITANCE!!!!!!!!!!!!!!!!!!!!

        System.out.println(color);
        //available, because it's public
    }
}
