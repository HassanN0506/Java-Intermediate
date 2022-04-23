package com.syntax.reviewClass11;

public class Animal {
    void sleep(){
        System.out.println("Animal is going to sleep.");
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println("Dog is going to sleep.");
    }
    void eat(){
        System.out.println("Dog is eating.");
    }
}

class Cat extends Animal{
    void sleep(){
        System.out.println("Cat is going to sleep.");
    }
}

class Test2{
    public static void main(String[] args) {
        //Cat cat = new Dog();  not possible

        Animal giraffe = new Dog(); //type-casting: Down-casting. Storing an object of dog class as an animal.
        //**PUTTING A DOG IN 'ANIMAL' BOX**


        //Dog d = new Animal();  not possible (up-casting)
        //Dog d = giraffe;   also down-casting.


        //giraffe.eat();    can't do it, because it is in the ANIMAL BOX, and Animal class doesn't have an eat method.


        Dog d = (Dog)giraffe; //EXPLICITLY changing the object 'giraffe' into an object of Dog class
        //**TAKING THE DOG OUT OF 'ANIMAL' BOX**
        //technically this is also up-casting, but in this situation it is allowed,
        //BECAUSE the object was of dog class ORIGINALLY (" Animal giraffe = new Dog(); ").
        //and we're also re-naming it to 'd'

    }
}
