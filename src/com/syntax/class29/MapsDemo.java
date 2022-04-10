package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Hassan");
        names.add("Bob");
        System.out.println(names);

        //if I want to get Hassan from my arrayList, I have to specify index 0
        System.out.println(names.get(0));


        HashMap<Integer, String> map=new HashMap<>();
        map.put(123123123, "Hassan"); //.put() to insert an entry

        System.out.println(map);

        //if I want to get Hassan from my MAP, I just have to give the Key
        System.out.println(map.get(123123123));


        System.out.println(map.get(123123123)); //returns Hassan
        System.out.println(map.get(123)); //returns null, because no such key exists

    }
}
