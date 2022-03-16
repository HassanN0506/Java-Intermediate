package com.syntax.class18;

public class Task {

    //task 1:
    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.
    int SumOfArray (int [] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    //task 2
    //Create a method that will take a String as a parameter and returns reversed String.
    //Method should be available to all classes within your project and accessible by class name.
    // SO I USE STATIC, SO IT CAN BE ACCESSIBLE BY CLASS NAME
    public static String reverseString(String a){
//        StringBuilder sb = new StringBuilder(a);
//        sb.reverse();
//        return sb.toString();

        //better way to do the same thing all in 1 line:
        return new StringBuilder(a).reverse().toString();
        //"Method chaining"
        /* steps:
        new StringBuilder(a) --> Object creation
        new StringBuilder(a).reverse() --> calling a method on that object
        new StringBuilder(a).reverse().toString() --> calling another method on that object
        return new StringBuilder(a).reverse().toString(); --> calling 2 methods on that object, and returning the result
         */
    }

    //task3
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //Method should be available inside the class only where it was declared and executed by calling it is name.
    private static String vowels (String a){
//        String b = a.replaceAll("[^aeiouAEIOU]", "");
//        return b;

        //method chaining:
        return a.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(vowels("Hassan"));
        //both vowels method and main method are static,
        // and they are both in the same class, so we can access vowels from main without creating an object.
    }

}
