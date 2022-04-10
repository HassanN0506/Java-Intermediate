package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {

        //if I want to remove entries that match a condition in both the Key AND the Value:

        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",50.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Pineapple",105.2);
        System.out.println(fruitMap);


        //I want to remove all entries form the map that contain an 'a' & are Greater than or equal to 20.

        //I'm changing the size of the map based on a condition, so I need to use iterator.
        //In order to use iterator, I need to First get a set or a collection.

//      We can shorten these 2 lines of code:
//          Set<String> keys = fruitMap.keySet();
//          Iterator<String> iterator = keys.iterator();

//      to this 1 line of code:
        Iterator<String> iterator = fruitMap.keySet().iterator();
        //we are  getting the keySet from fruitMap, and then getting an iterator for that set

        while (iterator.hasNext()){
            String key = iterator.next(); //saving this method's return as 'key'
            Double value = fruitMap.get(key); //saving the corresponding Value as 'value''
            if (key.toLowerCase().contains("a") && value>=20){
                iterator.remove();
            }
        }

        System.out.println(fruitMap);

    }
}
