package com.syntax.tester;

import com.syntax.class20.ParentClass;

public class Class20ParentClassTester extends ParentClass {
    void printInfo(){

        //System.out.println(name);
        //cannot access name, because it's private, and this is another class

        //System.out.println(age);
        //not accessible, because it's default, and we're in a different package
        //default things are NOT accessible in other packages

        System.out.println(weight);
        //accessible, because it's protected, and we're using INHERITANCE
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println(color);
        //available, because it's public
    }
}
