package com.syntax.tester;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTester {

    public static void main(String[] args) {

        AccessModifiers am=new AccessModifiers();

        //System.out.println(am.name); //private
        //not accessible, because PRIVATE access

        //System.out.println(am.age); //default
        //not accessible, because DEFAULT access

        //System.out.println(am.weight); //protected
        //not accessible, because PROTECTED access

        System.out.println(am.color); //public
        //Accessible, because it has PUBLIC access and is in the same project
    }

}