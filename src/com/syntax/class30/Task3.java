package com.syntax.class30;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
*/

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {

        HashMap <String, String> bestBuy = new HashMap<>();
        bestBuy.put("7664847", "printer");
        bestBuy.put("7879885", "tv");
        bestBuy.put("5613248", "Charger");

        System.out.println(bestBuy.entrySet());

    }
}
