package com.syntax.class19;

/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */

public class HW4Tester {
    public static void main(String[] args) {

        HW4 book1 = new HW4("Harry Potter", 700);

        System.out.println();

        new HW4("Cookbook", "Gordan Ramsey", 400);
    }

}
