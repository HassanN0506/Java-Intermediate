package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("carrot");
        vegetables.add("onion");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");

        //data structure nesting:
        Map<String, ArrayList<String>> healthyFoods = new HashMap<>();
        healthyFoods.put("Vegetables", vegetables);
        healthyFoods.put("Fruit", fruit);

        System.out.println(healthyFoods);
    }
}
