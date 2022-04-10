package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {

        //how to organize/remove duplicates from an arraylist:

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");

        System.out.println("ArrayList: "+arrayList);

        /*
        you can convert an arraylist to a set by passing it in the constructor
         */
        TreeSet<String> treeSet=new TreeSet<>(arrayList);
        System.out.println("TreeSet: "+treeSet);


        arrayList.clear(); //clearing the arrayList
        arrayList.addAll(treeSet); //storing linkedHashSet to the (now cleared) arrayList
        System.out.println("ArrayList now: "+arrayList);

        //now the arrayList has NO duplicates, AND it is in order!

        //if you want to maintain the insertion order, and just remove duplicates, use linked has set.
        //if you want to just remove duplicates and don't care about maintaining the order, use has set.

    }
}
