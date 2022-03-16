package com.syntax.class17;

public class HealthyDog {


    //when the information is expected to be different from object to object,
    // we store that information in an INSTANCE VARIABLE
    String name; //instance variable
    String color; //instance variable

    //if we know that a value will stay the same for all the objects of a class,
    //we create a STATIC VARIABLE for that
    static int numberOfLegs=4; //static variable
    //once you change it, it will stay changed for the rest of the code

    void eat(){
        int noOfTimes=3; //local variable
        System.out.println(name+" eats "+noOfTimes);
    }

    void sleep(){
        System.out.println(name+" is sleeping");
        //I CANNOT ACCESS A LOCAL VARIABLE FROM ANOTHER METHOD IN HERE
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog();
        //dog is an object, and it is ALSO a local variable, because it's in the Main method
        //???????????????????????????????????????????????????

        dog.name="Scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=6;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="Tommy";
        dog2.color="Blue";
        System.out.println(dog2.numberOfLegs); //we've changed the value to 6 in the previous object
        dog2.eat();



    }
}
