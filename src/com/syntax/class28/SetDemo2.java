package com.syntax.class28;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        /*
        LINKED Hash Set:
        -Removes duplicates
        -AND maintains insertion order

        *** LinkedHashSet is SLOWER than hashset
         */

        LinkedHashSet<String> fruit = new LinkedHashSet<>();
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

        //BUT, this time, it IS printed out in the order we entered items in it.
    }
}
