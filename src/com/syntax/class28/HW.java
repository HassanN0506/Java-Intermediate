package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HW {

    public static void main(String[] args) {

        /*
        Create a Set collection in which you need to add names of the countries. In this set we want all objects
        to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");
        countries.add("France");

        System.out.println(countries);

        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------------------");

        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("DC");
        cities.add("Atlanta");
        cities.add("San Antonio");
        cities.add("Chicago");

        System.out.println(cities);

        cities.removeIf(s -> s.toUpperCase().startsWith("A"));
        System.out.println(cities);

        System.out.println("---------------------------------------------------------------");

        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID.
        Display name of each student.
         */
        HashSet<Students> students = new HashSet<>();
        students.add(new Students("Hassan", 1234));
        students.add(new Students("Adam", 5678));

        for (Students student:students
             ) {
            System.out.println(student.name);
        }
    }
}

class Students{
    String name;
    int ID;

    public Students(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

}

