package com.syntax.class33;

public class ExceptionsDemo4 {
    public static void main(String[] args) {
        System.out.println("0");
        try{
            System.out.println("1");
            System.out.println(10/0);
            System.out.println("2");
        } catch (ArithmeticException e){
            //System.out.println("3");

            System.out.println("Class: "+e.getClass());
            System.out.println("Message: "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("4");
    }
}
