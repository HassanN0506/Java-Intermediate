package com.syntax.class19;

public class BirdsTester {

    public static void main(String[] args) {

        Birds bird1= new Birds("Hawk", 3, 'F');
        bird1.printInfo();

        System.out.println();

        Birds bird2= new Birds();
        bird2.printInfo();

        System.out.println();

        new Birds(" ", 0, ' ');
        new Birds();
        //YOU CAN ALSO JUST CALL THE CONSTRUCTOR ON IT"S OWN, WITHOUT CREATING ANY OBJECTS!!!!!!!!!!!!!!!!!!!!!!!
        //but you DO have to pass arguments to the parameterized constructor, so the compiler knows which constructor to call.
    }

}
