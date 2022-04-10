package com.syntax.class28;

/*
Create a Card class that will have implemented and unimplemented methods and a constructor that will initializes
credit card type.
Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

abstract class Card{
    String type;

    public Card(String type) {
        this.type = type;
    }

    void getType(){
        System.out.println(type);
    }

    abstract void getColor();
}

class Amex extends Card{

    public Amex(String type) {
        super(type);
    }

    @Override
    void getColor() {
        System.out.println("Black");
    }
}

class Visa extends Card{

    public Visa(String type) {
        super(type);
    }

    @Override
    void getColor() {
        System.out.println("Blue");
    }
}

class Discover extends Card{

    public Discover(String type) {
        super(type);
    }

    @Override
    void getColor() {
        System.out.println("Orange");
    }
}

public class Task3 {
    public static void main(String[] args) {

        LinkedList<Card> cards = new LinkedList<>(Arrays.asList(new Amex("Amex"), new Visa("Visa"),
                new Discover("Discover")));

        for (int i=0; i<cards.size(); i++){
            cards.get(i).getType();
            cards.get(i).getColor();
        }

        System.out.println();

        for (Card card: cards
             ) {
            card.getType();
            card.getColor();
        }

        System.out.println();


        Iterator<Card> itr = cards.iterator();

        while(itr.hasNext()){
            Card card = itr.next();
            card.getType();
            card.getColor();
        }
    }
}
