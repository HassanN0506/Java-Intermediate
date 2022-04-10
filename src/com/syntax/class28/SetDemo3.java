package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        /*
        TreeSet:
        -Removes duplicates
        -AND sorts items it IN ASCENDING ORDER.
         */

        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("A");
        fruit.add("Z");
        fruit.add("X");
        fruit.add("Y");
        fruit.add("H");
        fruit.add("Z");
        //fruit.add(null);  //TreeSet does NOT allow null values

        System.out.println(fruit);
        //"Z" is ONLY printed once, because the 1st "Z" element was OVERWRITTEN by the 2nd "Z" value.
        //AND it is printed out IN ASCENDING ORDER.

    }
}
