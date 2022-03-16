package com.syntax.tester;

/*
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package and observe result.
 */

import com.syntax.class19.HW1;

public class Class19HW1Tester {

    public static void main(String[] args) {

//        HW1 obj1 = new HW1(10);
//        HW1 obj2 = new HW1("blah blah blah");
//        HW1 obj3 = new HW1(10.12);
        // I get an ERROR for all but the Public constructor

        HW1 obj4 = new HW1(true);

        /*
        different package,
        I can only even CALL the Public constructor.
         */

    }
}
