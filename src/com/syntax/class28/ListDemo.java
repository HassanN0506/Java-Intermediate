package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("SDLC");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        courses.add("Dead");
        courses.add("Cucumber");
        courses.add("SDL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interviews");
        courses.add("Dead");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");

        System.out.println(courses);


        //to replace an element in a list:
        courses.set(courses.size()-1, "Happy");
        //courses.size()-1 is to get the INDEX of that last element

        System.out.println(courses);



        //System.out.println(courses.indexOf("Git"));
        //to get the index of a specific element
        courses.set(3, "jajajajajaja");
        //changing the value of that element

        System.out.println();



        /*
        You COULD just Combine the two:
         */
        courses.set(courses.indexOf("Docker"), "22222222222");



        System.out.println(courses);

        courses.set(courses.indexOf("Dead"), "BBBBBB");
        //but, remember, .set() only replaces the FIRST INSTANCE of the specified element !!!!!


        System.out.println(courses);



        /*
        if I have 2 elements with the same values,
        I can replace all, but only with a Lambda expression
         */
        courses.add("Java");
        System.out.println(courses);

        courses.replaceAll(new UnaryOperator<String>() {  //THIS IS THE SYNTAX WE ALWAYS HAVE TO WRITE:
            // " listName.replaceAll(new UnaryOp..." autofill the rest    !!!!!
            /*
            What lambda expression does is: withOUT using a loop (so it's faster than a loop),
            it passes each element in the 'courses' list 1 by 1 TO THE 'apply' METHOD

            and the 'apply' method is able to change the value of each element passed to it.
             */
            @Override
            public String apply(String s) { //Each element that is passed is 'String s' !!!!!
                if (s.equals("Java")){
                    return "Happy"; //"return" here REPLACES that String with "happy", if the condition is met !!!!!
                } else {
                    return s;   //otherwise, it returns the original value.
                }
            }
        });
        System.out.println(courses);


        //OR, you can just run it through a for loop
        for (int i=0; i< courses.size(); i++){
            if (courses.get(i).equals("Happy")){
                courses.set(i, "Java");
            }
        }
        /*
        but the "lambda" is FASTER than a loop.
         */
        System.out.println(courses);



        //another way of writing a LAMBDA expression:
        courses.replaceAll(s -> {
            if (s.equals("SDLC")) {
                return "1st lesson";
            } else {
                return s;
            }
        });
        /*
        1st, WRITE IT OUT AS SHOWN ABOVE, then:
        just left-click on the "UnaryOperator", and select
        "replace with lambda expression" option.
        it makes the code look cleaner.
         */

    }
}
