package com.syntax.reviewClass10;

class GrandParent{
    String name;
    public GrandParent(String name) {
        this.name=name;
        System.out.println("Grand Parent");
    }
    void printName(){
        System.out.println(name);
    }
}

public class Parent extends GrandParent{
    Parent(String name){
        super(name);
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child(String name){
        super(name);
        System.out.println("Child");
    }
}

class Tester{
    public static void main(String[] args) {
        Child child = new Child("Hassan");
        child.printName();
    }
}
