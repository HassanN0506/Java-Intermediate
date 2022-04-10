package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

        //use .put() method to add 1 entry at a time

        HashMap<String, Integer> fruit=new HashMap<>();
        fruit.put("Orange", 10);
        fruit.put("Apple", 5);
        fruit.put("Banana", 15);

        HashMap<String, Integer> vegetables=new HashMap<>();
        vegetables.put("Potato", 12);
        vegetables.put("Carrot", 8);
        vegetables.put("Spinach", 11);

        /*
        use .putAll() method to add all the entries in 1 entire map into another map
         */
        HashMap<String, Integer> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(vegetables);

        System.out.println(groceries);


        //work same as .add() and .addAll() methods, but with Maps

    }
}

