package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
 */

class Person{
    final private String name;
    final private String lastName;
    final private int age;
    final private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


/*
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
public class Task4 {
    public static void main(String[] args) {
        TreeMap<String,Person> persons = new TreeMap<>();
        persons.put("123", new Person("Hassan", "Nawaz", 24, 50000));
        persons.put("456", new Person("lily", "potter", 25, 50000));

        for (Map.Entry<String, Person> entry : persons.entrySet()){
            System.out.println(entry);
        }

    }
}
