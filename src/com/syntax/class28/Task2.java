package com.syntax.class28;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */


import java.util.ArrayList;
import java.util.Iterator;

abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();

}

class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Getting the quote for a "+carModel+" from "+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling "+insuranceName+" insurance policy");
    }

}

class Pet extends Insurance {
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Getting the quote for a " + petType + " from " + insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling " + insuranceName + " insurance policy");
    }

}

class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Getting a quote from "+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling "+insuranceName+" insurance policy");
    }

}

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Insurance> insTypes = new ArrayList<>();
        insTypes.add(new Car("Progressive","BMW"));
        insTypes.add(new Pet("PetCo","pitbull"));
        insTypes.add(new Health("Kaiser"));

        System.out.println("w/ For loop:");
        for(int i=0; i<insTypes.size(); i++){
            insTypes.get(i).getQuote();
            insTypes.get(i).cancelInsurance();
            System.out.println();
        }

        System.out.println();

        System.out.println("w/ Enhanced for loop:");
        for(Insurance obj : insTypes){
            obj.getQuote();
            obj.cancelInsurance();
            System.out.println();
        }

        System.out.println();

        System.out.println("w/ Iterator:");
        Iterator<Insurance> iterator = insTypes.iterator();

        while (iterator.hasNext()){
            Insurance iteration = iterator.next();
            iteration.getQuote();
            iteration.cancelInsurance();
            System.out.println();
        }

    }
}
