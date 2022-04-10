package com.syntax.class28;

import java.util.*;
import java.util.function.UnaryOperator;

public class Task {
    public static void main(String[] args) {

       //Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Honda");

        System.out.println(cars);

        for (String car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();

        Iterator<String> itrz = cars.iterator();
        while(itrz.hasNext()){
            System.out.print(itrz.next()+" ");
        }
        System.out.println();



        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hi", "Bee", "Cat", "APPLE"));
        System.out.println(words);

        Iterator<String> itr = words.iterator();

        while(itr.hasNext()){
            if(itr.next().toLowerCase().endsWith("e")){
                itr.remove();
            }
        }

        //lambda expression to do the same thing:
//        words.removeIf(s -> s.toLowerCase().endsWith("e"));

        System.out.println(words);



        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("pepsi", "coke", "ginger ale", "RC"));
        System.out.println(drinks);

        for(int i=0; i< drinks.size(); i++){
            if(drinks.get(i).toLowerCase().contains("a") || drinks.get(i).toLowerCase().contains("e")){
                drinks.set(i, "water");
            }
        }

//        drinks.replaceAll(s -> {
//            if (s.contains("a") || s.contains("e")) {
//                return "water";
//            } else {
//                return s;
//            }
//        });

        System.out.println(drinks);



        /*
        Create an arrayList of even numbers from 1 to 500.
        Remove any number that is divisible by 5 from that arrayList
         */

        ArrayList<Integer> evenNums = new ArrayList<>();

        for(int i=2; i<=500; i+=2){
            evenNums.add(i);
        }

        System.out.println(evenNums);

        Iterator<Integer> iterator = evenNums.iterator();

        while(iterator.hasNext()){
            if(iterator.next()%5 == 0){
                iterator.remove();
            }
        }

//        evenNums.removeIf(integer -> (integer % 5) == 0);

        System.out.println(evenNums);

    }
}
