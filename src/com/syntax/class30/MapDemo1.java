package com.syntax.class30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {

        LinkedHashMap<String,Double> fruitMap=new LinkedHashMap<>();

        //fruitMap.put("Apple",20); auto-casting does not happen in maps, or in collections
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Banana",20.0); //duplicate keys not allowed, but it will still run

        System.out.println(fruitMap);
        /*
        prints value '20.0' for key Banana,
        because the 1st value for 'Banana' was overwritten by the 2nd value
         */

        fruitMap.put("Banana",100.5);
        System.out.println(fruitMap); //now the value was overwritten again
        /*
        notice how the entry is in the same position
        it does not make a new entry, it just overwrites the value for the duplicate key
        and insertion order is maintained, because it is LinkedHashMap
         */
    }
}
