package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        /*
        Sets:
        -Do not add duplicate values
        -Insertion order is NOT guaranteed
         */
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Pineapple");
        fruit.add("Dragon Fruit");
        fruit.add("Cherry");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Tomato");
        fruit.add("Apple");
        fruit.add(null);

        System.out.println(fruit);
        //Apple is ONLY printed once, because the 1st "Apple" element was OVERWRITTEN by the 2nd "Apple" value.
        //And it is NOT printed out in the order we entered items in it.
    }
}
