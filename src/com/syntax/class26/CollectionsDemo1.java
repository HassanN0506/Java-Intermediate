package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name = "Yazgul";
        String name2 = "Farah";
        //Not scalable if we have to store large amount of data

        //Arrays can be a good option to tackle this problem
        String[] names = {"Yazgul", "Farah"};
        //but the downside of arrays is they have a fixed size
        //i can't add on a 3rd name in a further line of code
        //and if i declare the array to be like 1000 elements, i'm wasting memory
        //all the elements i don't assign values to get have their dataType's default values
        //also, there are no built-in methods to search for or replace a specific value within an array
        //without running it through a loop and checking each value, which uses up time and memory
        String[] names2 = new String[100];


        //OR, we could just do:

        ArrayList<String> syntaxStudents = new ArrayList<>();
        //ArrayList is the name of the Class
        //<> diamond operators
        //String dataType
        //syntaxStudents is the name of the array
        //new keyword is creating an object of ArrayList class

        syntaxStudents.add("Hassan");
        syntaxStudents.add("Mike");
        syntaxStudents.add("John");
        System.out.println(syntaxStudents);
    }
}
