package com.syntax.class28;

public class GenericsDemo {

    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        //add(10.5, 12.6);
        /*
        i cannot pass doubles to a method that has int parameters
        unless it's overloaded with double parameters
        this can be a lot of code if we override the method for every data type
         */

        //so instead, we use Generics

    }
}
