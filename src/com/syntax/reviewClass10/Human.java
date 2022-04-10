package com.syntax.reviewClass10;

public class Human {
    private String name;
    private String color;
    private int age;

    Human(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
        System.out.println("Inside the parent class Human ");
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}

class Employee extends Human{
    String employeeID;

    Employee(String name, String color, int age, String employeeID){
        super(name, color, age);
        this.employeeID=employeeID;
    }

    void printInfo(){
        super.printInfo();
        System.out.println(employeeID);
    }
}

class Teacher extends Employee{
    String favSubject;

    Teacher(String name, String color, int age, String employeeID, String favSubject) {
        super(name, color, age, employeeID);
        this.favSubject=favSubject;
    }

//    void printInfo(){
//        super.printInfo();
//        System.out.println(favSubject);
//    }
}

class Tester2{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Asghar", "super white", 22,
                "123", "Java");
        teacher.printInfo();
    }
}