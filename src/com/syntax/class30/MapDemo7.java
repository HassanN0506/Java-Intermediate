package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {
    public static void main(String[] args) {

        //A BETTER WAY TO REMOVE ENTRIES FROM A MAP BASED ON A CONDITION FOR KEYS && VALUES:

        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",50.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Pineapple",105.2);
        System.out.println(fruitMap);

        //I want to remove all entries form the map that contain an 'a' & are Greater than or equal to 20.

        Iterator<Map.Entry<String,Double>> iterator = fruitMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            if(entry.getKey().toLowerCase().contains("a") && entry.getValue()>=20) {
                iterator.remove();
            }
        }

        System.out.println(fruitMap);

        /*
        Lambda expression to do the same thing:
        fruitMap.entrySet().removeIf(ent -> ent.getKey().toLowerCase().contains("a") && ent.getValue() >= 20);
         */


    }
}
