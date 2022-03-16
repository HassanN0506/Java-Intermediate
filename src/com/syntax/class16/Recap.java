package com.syntax.class16;

public class Recap {


    public static void main(String[] args) {

        String str = "Hassan Nawaz";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(str.length() - 1));

        System.out.println("-----------------------------------");

        System.out.println(str.indexOf('A'));
        //Doesn't exist
        System.out.println(str.indexOf('s'));
        //FIRST OCCURRENCE
        System.out.println(str.lastIndexOf('s'));
        //looks for the LAST OCCURRENCE

        System.out.println("---------------------------------------------------------");

        String s = "My number is #1234567890. Call me.";
        //i want to print out the number only
        //1st, find the index of the '#'
        System.out.println(s.indexOf('#'));
        //index is 14, so i can hard-code it to start at index 15, or i could:
        System.out.println(s.substring(s.indexOf("#") + 1));
        //just go to the index of '#' PLUS ONE
        //now, i just have to trim of the end of the line,
        // we know there are 10 numbers in a phone number, so we can set the last index to 10+ the beginning index
        System.out.println(s.substring(s.indexOf("#") + 1, s.indexOf("#") + 1 + 10));


    }

}
