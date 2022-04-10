package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Task5 {

    public static void main(String[] args) {
        HashMap<String, Double> employeeSalaries = new HashMap<>();
        employeeSalaries.put("Hassan", 80000.0);
        employeeSalaries.put("John", 50000.0);
        employeeSalaries.put("Jane", 70000.0);
        employeeSalaries.put("Emily", 100000.0);

        double highest = 0.0;
        String name = null;
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            double salary = entry.getValue();
            if (salary > highest) {
                highest = salary;
            }
            if(highest==entry.getValue()){
                name=entry.getKey();
            }
        }

        System.out.println(name+"=$"+highest);
    }
}
















