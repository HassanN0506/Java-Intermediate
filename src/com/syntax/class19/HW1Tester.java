package com.syntax.class19;

/*
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package and observe result.
 */

public class HW1Tester {

    public static void main(String[] args) {

        new HW1(10);
        new HW1("blah blah blah");
        new HW1(10.12);
        new HW1(true);

        /*
        Same package, different class,
        I see everything EXCEPT Private.

        I get default twice, because Java converted the int into a double and called the default twice.
         */

    }
}
