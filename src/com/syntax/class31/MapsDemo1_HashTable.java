package com.syntax.class31;

import java.util.*;

public class MapsDemo1_HashTable {

    public static void main(String[] args) {

        Hashtable<String, String> students = new Hashtable<>();
        students.put("1", "Hassan");
        students.put("2", "Emilia");
        students.put("3", "Medine");
        students.put("4", "Yazgul");
        students.put("5", "Maha");

        Set<Map.Entry<String, String>> entrySet = students.entrySet();
        //this is called "data structure nesting"

        for(Map.Entry<String, String> entry : entrySet){
            System.out.println(entry);
        }
        //insertion order is not maintained

    }
}
