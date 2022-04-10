package com.syntax.class30;

import java.util.LinkedHashSet;

/*
Create the collection that will store single unique Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task6 {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("Hello");
        strings.add("World");

        String all = "";
        for (String string:strings
             ) {
            all=all+" "+string;
        }

        System.out.println(all);
    }
}
