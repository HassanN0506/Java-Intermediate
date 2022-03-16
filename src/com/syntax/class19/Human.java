package com.syntax.class19;

public class Human {
    String name;
    int age;
    double weight;
    char gender;

    public Human(String name, int age) {
        System.out.println("Important code");
        System.out.println("Important code");
        this.name = name;
        this.age = age;
        System.out.println("C1");
    }

    public Human(String name, int age, double weight) {
        this(name, age);
        //we're putting a constructor within a constructor chaining
        this.weight = weight;
        System.out.println("C2");
    }

    public Human(String name, int age, double weight, char gender) {
        this(name, age, weight);
        //another chained constructor
        this.gender = gender;
        System.out.println("C3");
    }
}
