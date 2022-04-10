package com.syntax.reviewClass10;

public class Bike {
    int maxSpeed = 100;
    int horsepower=10;

    void printHorsepower(){
        System.out.println("Parent class's Horse Power: "+horsepower);
    }

    void printMaxSpeed() {
        System.out.println(maxSpeed);
    }
}


class HondaBikes extends Bike{
    int maxSpeed=150;
    int horsepower=25;

    void printHorsepower(){
        System.out.println("Child class's Horse Power: "+horsepower);
    }

    void printMaxSpeed(){
        int maxSpeed=200;
        System.out.println("Local var: "+maxSpeed);
        System.out.println("Instance var: "+this.maxSpeed);
        System.out.println("Parent class's var: "+super.maxSpeed);
    }

    void printHPFromParentAndChild(){
        super.printHorsepower();
        printHorsepower();
    }
}


class Tester3{
    public static void main(String[] args) {
        HondaBikes hondaBikes= new HondaBikes();
        hondaBikes.printMaxSpeed();

        System.out.println();

        hondaBikes.printHPFromParentAndChild();
    }
}
