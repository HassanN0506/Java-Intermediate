package com.syntax.class16;

public class StringVsStringBuilder {


    public static void main(String[] args) {

        String s = "Hassan is great";
        System.out.println(s.replace(" ", ""));
        System.out.println(s);
        //s has not been modified, just the printout

        StringBuilder sB = new StringBuilder("Hassan is great");
        System.out.println(sB.reverse());
        System.out.println(sB);
        //sB has now been changed, NOT JUST the printout, because w/ StringBuilder, ANY modification made is saved in StringBuilder

        //to change a String, we must explicitly do so, but StringBuilder gets modified WHENEVER WE CALL A METHOD to it

        //sB=sB+"HAhaHAha"; ERROR!!!!!!!!
        //we cannot CONCATENATE a StringBuilder, so we APPEND instead:
        sB.append("HAhaHAha");
        System.out.println(sB);

        //StringBuilder take up more memory than String, so String is preferred
        //Only use StringBuilder when you know you need to manipulate it with methods often
        //however, StringBuilder processes faster, so if SPEED is priority over MEMORY, then use StringBuilder.

        //String objects are "IMMUTABLE", meaning they can't be modified unless you force it

        //StringBuilder is "Mutable", meaning it can be modified

        StringBuilder str= new StringBuilder("666");
        for(int i=0; i<10; i++) {
            str.append(i);
        }
        System.out.println(str);

        //append, reverse, and toString can only be used in StringBuilder class (not for Strings)!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    }


}
