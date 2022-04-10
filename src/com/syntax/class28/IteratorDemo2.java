package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");

        /* to use Iterator (INTERFACE), first we must:

        1. type " listName.iterator(); "
              -this calls the iterator method on that list

        2. type " Iterator<classOfListObjects> iteratorName = "
              -here, we are creating a variable of Iterator class to hold that method call we did in step 1
              -whatever is inside the "<>" must be the same as whatever is inside the "<>" when we created the list.
         */


        Iterator<String> itr = courses.iterator();
        //creating an object of Iterator interface called itr
        //and assigning it (=) the call to the method ".iterator()" on "courses" list


        //iterator ITERATES (ONE TIME) through every element of a list
        //it uses a pointer to get each element of a list
        //can only go forwards, and each iterator can only be used 1 time through an entire list


        /*
        Methods we use that are in the Iterator interface:

        " .hasNext() "
            -Iterator always starts from BEFORE 1st element in the list (so @ index -1), and
            -this method returns a boolean based on if there is an element present WHERE THE ITERATOR CURRENTLY IS.
            -so, it will always return true until the iterator is positioned ON the last element (because there is no element after that)


        " .next() "
            -moves on to the next element of the list
            -if you print out this line, it'll print out the element the iterator is CURRENTLY ON
            -everytime you use this method, the iterator moves on to the next element


        " .remove() "
            -Removes from the list the element that the iterator is currently on

         */


        System.out.println("there are "+courses.size()+" elements in 'courses' list");
        System.out.println("@ Index 0: "+itr.hasNext());
        System.out.println("Index 0: "+itr.next());
        System.out.println("@ Index 1: "+itr.hasNext());
        System.out.println("Index 1: "+itr.next());
        System.out.println("@ Index 2: "+itr.hasNext());
        System.out.println("Index 2: "+itr.next());
        System.out.println("@ Index 3: "+itr.hasNext());
        System.out.println("Index 3: "+itr.next());
        System.out.println("@ Index 4: "+itr.hasNext());
        System.out.println("Index 4: "+itr.next());
        System.out.println("@ Index 5: "+itr.hasNext());//false, because there is nothing next on the list

        //System.out.println("Index 5: "+itr.next());
        //"NoSuchElementException" because there is nothing left to iterate through

    }
}
