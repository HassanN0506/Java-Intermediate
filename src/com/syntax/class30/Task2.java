package com.syntax.class30;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String,String> capitolCities = new TreeMap<>();
        capitolCities.put("USA","DC");
        capitolCities.put("Mexico","Mexico City");
        capitolCities.put("France","Paris");

        System.out.println("For each loop:");
        for (Map.Entry<String,String> entry:capitolCities.entrySet()
             ) {
            System.out.println(entry);
        }

        System.out.println();
        System.out.println("Iterator:");
        Iterator<Map.Entry<String,String>> iterator = capitolCities.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("For each loop:");
        for (String value:capitolCities.values()
             ) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Iterator:");
        Iterator<String> iterator2 = capitolCities.values().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
