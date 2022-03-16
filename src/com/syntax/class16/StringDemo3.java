package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {


    public static void main(String[] args) {

        String s = "This is a sentence";

        String[] strArr= s.split(" ");
        //creating an array, and storing all the words as an element in the array
        //telling Java to split AT THE SPACES, so it knows where to separate
        //it separates BEFORE evey char we specified

        System.out.println(Arrays.toString(strArr));
        //printing the ARRAY, not the array address

        System.out.println(strArr.length);
        //there are 4 elements in this array

        System.out.println(strArr[0]);
        //printing specific element, which in this case is a word in my sentence i wrote

        System.out.println(strArr[3].trim());
        //prints the element, and W/O the space, because we used TRIM method


        //WHAT WAS I TRYING TO DO HERE??????????
        String s2 = "My name is Hassan. Blah. Yadda. Rabba.";
        String[] strArr2 = s2.split("[.]");
        System.out.println(Arrays.toString(strArr2));
        System.out.println(strArr2[1].trim());


        //finding how many questions/sentences are in the following string?
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr3=a.split("[?]");
        System.out.println(strArr3.length);
        //OR, YOU COULD JUST:
        System.out.println(a.split("[?]").length);
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    }


}
