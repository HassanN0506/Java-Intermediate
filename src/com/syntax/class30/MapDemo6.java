package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",50.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Pineapple",105.2);
        System.out.println("Map: "+fruitMap);

        // .entrySet() returns a set of entries (which contain the correlated keys and values)
        System.out.println("Entry Set: "+fruitMap.entrySet());

        System.out.println("------------------------------");


        // 'Map.Entry<keyType, valueType>' is like the dataType for entries !!!!!

        for (Map.Entry<String,Double> entry : fruitMap.entrySet()
             ) {
            System.out.println("Entry: "+entry);
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
            System.out.println();
        }

        System.out.println("------------------------------");

        //to get only the keys:
        System.out.println(fruitMap.keySet());

        //to get only the values:
        System.out.println(fruitMap.values());

        //to get both:
        System.out.println(fruitMap.entrySet());

        ////////////////////////////////////////////////////////////
        System.out.println();

        //getting the iterator:
        //  fruitMap.entrySet().iterator();

        //storing the iterator:
        //  Iterator<> itr = fruitMap.entrySet().iterator();

        /*
        But what goes inside <> ???
        Well, the entries inside fruitMap are String keys and Double values
        But <String,Double> gives an error

        This is because ONLY 1 argument can be passed in the iterators <>
        So, to get an iterator for entries, we need to "wrap" the 2 types
        syntax:
            < Map.Entry<keyType,valueType> >
         */

        Iterator<Map.Entry<String,Double>> itr = fruitMap.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<String, Double> entry = itr.next();  //saving this method's return as an entry
            System.out.println("Entry: "+entry);
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
            System.out.println();
        }

    }
}
