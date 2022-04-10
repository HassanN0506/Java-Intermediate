package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Kiwi",105.2);

        /*
        If you were to get a set of values from a map,
        some of them may be duplicates.
        And Sets do not allow duplicates,
        so every duplication of a value will overwrite the preceding duplicate value.
        Therefor, it would not be reliable. So it is not allowed.
         */

        //so, instead of sets, we store the values in a 'collection':

        Collection<Double> values = fruitMap.values();
        //we are creating a collection of Double class types named 'values'
        //and storing all the values of fruitMap inside it, via the '.values()' method

        System.out.println(values);

        Iterator<Double> iterator = values.iterator();
        while(iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }

        System.out.println(fruitMap);
        //removed apple and kiwi, bc their values were greater than or equal to 20

        /*
        same thing w/ Lambda expression:
            Collection<Double> values = fruitMap.values();
            values.removeIf(a -> a >= 20);
         */

    }
}
