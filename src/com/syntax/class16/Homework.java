package com.syntax.class16;

public class Homework {

        //for Task4.java
        String reverseString(String inputString){
            //converting a String to StringBuilder to that we can use the reverse method:
            StringBuilder sB = new StringBuilder(inputString);
            sB.reverse();
            return sB.toString();
        }

        //task5
        boolean isPalindrome(String inputString){
            //we're going to use the reverseString method we created above for task4
            String possiblePalindrome=reverseString(inputString);
            return possiblePalindrome.equals(inputString);
        }

        public static void main(String[] args) {

            //task1
            //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
            String a = "Hi, my name is Hassan.";
            System.out.println(a.replace(" ", ""));


            System.out.println("---------------------------------------------------------------------");

            //task2
            //Create a String that should be combination of letters, numbers and special characters.
            //Find out how many Alphanumeric characters are there in the String.
            String b = "ABC abc 123 !@#";
            System.out.println((b.replaceAll("[^A-Za-z0-9]", "")).length());

            System.out.println("---------------------------------------------------------------------");


            //task3
            //You have a String a=â€Is it saturday? Is it raining? Do we have a Java Class today?â€
            // How would you find out how many sentences are in that String?
            String c = "Is it saturday? Is it raining? Do we have a Java Class today?";
            System.out.println(c.split("[?,!,.]").length);

            System.out.println("---------------------------------------------------------------------");


            //task4
            // How would you reverse a String word by word? for example
            // input=>This is sentence i want to reverse
            // output=>sihT si ecnetnes i tnaw ot esrever
            String d = "Sunday is great";
            Homework task4 = new Homework();
            //System.out.println(task4.reverseString(d));
            String[] strArray=d.split(" ");
            //System.out.println(strArray[0]);
            for(int i=0; i< strArray.length; i++){
                System.out.print(task4.reverseString(strArray[i]+" "));
            }

            System.out.println();

            System.out.println("---------------------------------------------------------------------");


            //task5
            //How would you check if String is palindrome or not?   aba=> true  Abbc =>false
            Homework task5 = new Homework();
            System.out.println(task5.isPalindrome("madam"));
            System.out.println(task5.isPalindrome("nah"));

            System.out.println("---------------------------------------------------------------------");


            //task6
            //How would you swap  2 strings without a temporary variable?


        }


}
