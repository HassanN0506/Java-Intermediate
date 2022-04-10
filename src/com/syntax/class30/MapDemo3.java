package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Kiwi",105.2);

        /*
        if we change the size of the map while looping through a map,
        the boundaries of the loop will be thrown off by the change in size (same as with collections).
        So, we have to use iterator.
         */

        //how to get Iterator for keys:
        fruitMap.keySet(); //this method returns a set of Keys

        Set<String> keys = fruitMap.keySet();
        //we are assigning that method call to the variable 'keys' (which is a Set of Strings)
        //Class in <> must be the same as the class of the keys

        System.out.println(keys);

        Iterator<String> iterator = keys.iterator();
        //creating an iterator for that set of key values by calling the .iterator() method


        //I want to remove all the elements from my map that have the letter 'e'
        System.out.println(fruitMap);

        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().contains("e"))
                iterator.remove();
        }

        System.out.println(fruitMap);
        //the entries for the key "Apple" and "Orange" are removed

        /*
        We are removing elements from the set of key values we created earlier.
        And it is linked to the map (because we used the 'fruitMap.keySet()' method),
        so if we remove an element form the set, it also removes it from the map.
         */
        /*
        Remember, the iterator is set to the map's KEY values,
        so it can only remove entries based on if the condition applies to the KEYS.
         */
        /*
        Same thing w/ a LAMBDA expression:
            Set<String> keys = fruitMap.keySet();
            keys.removeIf(s -> s.toLowerCase().contains("e"));
        It still refers to the set of key values,
        so to use a LAMBDA expression, we must still FIRST create that set of key values.
         */


    }
}
