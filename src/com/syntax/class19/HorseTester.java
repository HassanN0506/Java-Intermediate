package com.syntax.class19;

public class HorseTester {
    public static void main(String[] args) {
        Horse obj1 = new Horse("Jax", 7, 400);

        /*
        Horse --> Data type (for objects, the dataType is always the name of the class)
        obj1  --> Object/instance/reference variable/variable NAME (same thing, different ways of referring to it)
        =     --> Assignment operator
        new   --> Keyword for creating an instance/object

        Horse("Jax", 7, 400)
              --> Call to the CONSTRUCTOR of Horse class

        ;     --> "Line terminator" AKA "Statement terminator"

         */
        obj1.printHorseName();
    }
}
