package com.syntax.class18;

public class AccessModifierTester {

    public static void main(String[] args) {

        AccessModifiers am = new AccessModifiers();

        //System.out.println(am.name); //private
        //i cannot access this variable, as 'name' has PRIVATE access

        //the rest are accessible from a new class in the same package
        System.out.println(am.age); //default
        System.out.println(am.weight); //protected
        System.out.println(am.color); //public

    }
}
