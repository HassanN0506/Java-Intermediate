package com.syntax.class33;

public class ExceptionsDemo3 {
    public static void main(String[] args) {

        System.out.println("BEFORE the tryCatch block");
        //System.out.println(10/0);
        try{
            System.out.println(10/0);
            //throw new RuntimeException();
            System.out.println("Program reached end of 'try' block");
        }
        catch(ArithmeticException aE){
            System.out.println("**1 " );
            System.out.println(10/0);
        }
        catch(Exception exception){
            System.out.println("**Something went wrong");
        }
        finally{
            System.out.println("FINALLY");
        }

        System.out.println("AFTER the tryCatch block");

    }
}
