package com.syntax.class16;

public class StringDemo1 {


    public static void main(String[] args) {

        String str = "Batch 12 is good";

        //REPLACEMENT METHOD:

        System.out.println(str);
        System.out.println(str.replace(" ", ""));
        //just removing all spaces in the PRINTOUT

        System.out.println(str);
        str = str.replace("good", "the best batch ever!");
        //you have to ASSIGN the change made back to the string if you want to change the string forever!!!!!!!!
        System.out.println(str);




    }


}
