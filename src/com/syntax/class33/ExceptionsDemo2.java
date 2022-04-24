package com.syntax.class33;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        System.out.println("BEFORE the tryCatch block");

        try{
            //System.out.println(10/0);

            String name = null;
            //name.length();

            //int[] arr = new int[-5];

            String[] strArr = new String[2];
            strArr[5]="Whatever";

            throw new RuntimeException();
        }
        catch(ArithmeticException aE){
            System.out.println("**1 " );
        }
        catch(NullPointerException nPE){
            System.out.println("**2 " );
        }
        catch(NegativeArraySizeException nASE){
            System.out.println("**3 " );
        }
        catch(IndexOutOfBoundsException iOOBE){
            System.out.println("**4 " );
        }

        //catchALL block for anything not specified:
        catch(Exception exception){ //the 'EXCEPTION' catchBlock myst ALWAYS be the last one
            System.out.println("**Something went wrong");
        }

        System.out.println("AFTER the tryCatch block");
    }
}
