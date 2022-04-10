package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        countries.add("USA");
        countries.add("Ghana");
        countries.add("Morocco");
        countries.add("Mexico");

        System.out.println(countries.get(1)); //Ghana
        // System.out.println(countries.get(-1));
        //System.out.println(countries.get(4));
        //ERROR out of bounds


        System.out.println(countries);

        countries.add(3, "Pakistan");
        /*
        inserts the elements at this specific index
        IT MOVES EVERYTHING AFTER IT TO THE RIGHT
         */
        System.out.println(countries);


        System.out.println(countries.size());
        //to get the size of this array list
        //size() method is dynamic (meaning it functions at runtime, not compile-time)


        countries.remove("Pakistan");
        System.out.println(countries);
        //removes the specified element (specified by the 'object', which is the value of the element)

        //remove method is overloaded so that you can specif the OBJECT, or the INDEX
        countries.remove(0);
        System.out.println(countries);


        countries.clear();
        System.out.println(countries);
        //clears EVERYTHING


        System.out.println(countries.size());
        //zero now

    }
}
