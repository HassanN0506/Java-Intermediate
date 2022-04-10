package com.syntax.class30;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Kiwi",105.2);

        //to get the value for Kiwi:
        System.out.println(fruitMap.get("Kiwi")); //argument passed is key

        System.out.println(fruitMap.get("KIWI")); //case sensitive
        //if the argument passed is not a key in the map, it returns 'null'
        //(cannot use .ignoreCase() method)


        //to remove an entry:
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        //we must refer to it by the keys value
        //CANNOT remove an entry by referring to its value (because we may have duplicate values)!!!!!

        System.out.println(fruitMap.remove("Kiwi"));
        /*
        When you remove an entry, the value is returned
         */


        //to see if a key is present:
        System.out.println(fruitMap.containsKey("Apple"));

        //to see is a value is present:
        System.out.println(fruitMap.containsValue(2000.0));


        //to see if there is ANY entry in the map:
        System.out.println(fruitMap.isEmpty());

        //to see the size:
        System.out.println(fruitMap.size());


        //to change a value:
        fruitMap.replace("Apple", 50.5); //pass the kay and the new value
        System.out.println(fruitMap);
        /*
        there is no method to change the key,
        but we can remove an entry, and then add a new entry with a new key and the same value

        but insertion order will get changed in LinkedHashMap if we do this
         */


    }
}
