package com.syntax.class19;

/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */

public class HW4 {

    String title;
    String author;
    int numOfPages;

    public HW4(String title, int numOfPages){
        this.title = title;
        this.numOfPages = numOfPages;
        System.out.println(title+" has "+numOfPages+" pages.");
    }

    public HW4(String title, String author, int numOfPages){
        this(title, numOfPages);
        this.author = author;
        System.out.println("Witten by "+author+".");
    }

}
