package com.syntax.class30;

import java.util.ArrayList;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        int sum=0;
        for (int a:numbers
             ) {
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
