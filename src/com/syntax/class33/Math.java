package com.syntax.class33;

public class Math {
    void add (int a, int b){
        System.out.println(a+b);
    }
    void divide (int a, int b){
        /*
        if(b!=0) {
            System.out.println(a / b);
        } else{
            System.out.println("ERROR: cannot divide by zero");
        }
         */
        try {
            System.out.println(a / b);
        }catch(ArithmeticException are){ //'are' is just the name of the object of Exceptions class
            System.out.println("ERROR: cannot divide by zero" + are.getMessage());
        }catch(NullPointerException npe){
            System.out.println("ERROR: object not initialized" + npe.getMessage());
        }
    }
}
