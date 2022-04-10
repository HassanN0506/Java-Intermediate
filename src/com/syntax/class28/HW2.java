package com.syntax.class28;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
 */

public class HW2 {

    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println("aList: "+aList);

        // 1 way of doing it:
        //        LinkedHashSet<String> aListCopy = new LinkedHashSet<>();
        //        for (String aListElement:aList
        //        ) {
        //            aListCopy.add(aListElement);
        //        }


        //Another way of doing it:
        //        LinkedHashSet<String> aListCopy = new LinkedHashSet<>();
        //        aListCopy.addAll(aList);


        //The best way of doing it:
        LinkedHashSet<String> aListCopy = new LinkedHashSet<>(aList);

        System.out.println("aList w/o duplicates: "+aListCopy);

    }
}
