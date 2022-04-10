package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

        //courses.removeIf(course -> course.equals("Java"));
        /*
        for the sake of learning Iterator, don't use this method for now
         */


        //if we want to remove an element of a list, we run it through a loop, and use the remove() method:

        System.out.println(courses);
        for(int i = 0; i < 5; i++){     //NOT USING " courses.size() " TO CONVEY MY POINT
            if(courses.get(i).equals("Java")){
                courses.remove("Java");
            }
        }
        System.out.println(courses);

        //BUT THIS RETURNS A RUN-TIME ERROR, BECAUSE AS WE REMOVE OR ADD ELEMENTS, IT MESSES UP THE COUNT FOR THE LOOP
        /*
        (even when the boundary of the for loop are NOT hardcoded, THERE ARE CASES WHERE IT STILL GOES WRONG!!!!!!!!)
        EVEN WHEN THE BOUNDARIES OF THE LOOP ARE DYNAMIC, IT CAN STILL GO WRONG.
        SO WHENEVER YOU'RE CHANGING THE SIZE OF A LIST AT RUNTIME, ALWAYS, ALWAYS, ALWAYS, USE THE "ITERATOR" !!!!!!!!
         */

        //"Concurrent Modification Exception" - means:
        // the code is being modified CONCURRENTLY (at the same time) as it is being executed.


//        for (String z : courses
//             ) {
//            if(z.equals("Java")){
//                courses.remove(z);
//            }
//        }
        //For-each loop ALSO RETURNS THE SAME ERROR.
        //and you can't choose to hard-code or dynamically-code a for-each loop     !!!!!
        //(for-each loop does not change it's size dynamically)


        //so, as the list gets shorter, the for loop's condition goes Out Of Bounds
        //and if the list gets longer, we can't check the elements that get added to the end


        //that is why we use "iterators"
        //whenever we are CHANGING THE SIZE of a list at run-time.

        /*
        ALL the loops have problems when you change the size of a list while using a loop. REMEMBER THAT!!!!!
        ALL THE LOOPS HAVE PROBLEMS WHEN YOU CHANGE THE SIZE OF A LIST WHILE USING A LOOP.

        !!!!!!!!!!!!!!!!!!!!!!!!!!
        SO ALWAYS USE ITERATOR WHEN YOU NEED TO CHECK A CONDITION AND CHANGE THE SIZE OF A LIST BASED ON THAT CONDITION
        !!!!!!!!!!!!!!!!!!!!!!!!!!
        it's best practice :)

        otherwise, loops are fine.
         */

    }
}
