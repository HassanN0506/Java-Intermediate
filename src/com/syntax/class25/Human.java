package com.syntax.class25;

public interface Human {
    //public static final are redundant, because by default, all the variables are already that.
    //so, i'll get an error if i try to change any of those.

    //public static final int legs=2;
    int legs=2;

    //public abstract void walk();
    //public and abstract are redundant for methods in an interface, because they are that
    // by default.
    void walk();

    //we can also have STATIC methods here
    static void printLegs(){
        System.out.println("Legs");
    }

}

interface LivingBeing{
    static void printLegs(){
        System.out.println("Something else");
    }
}


class Maha implements Human, LivingBeing{

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();

        //maha.printLegs();
        //Maha.printLegs();
        Human.printLegs();
        LivingBeing.printLegs();
        /*
        when a subclass is inheriting a Static method from a parent class, that
        static method CAN be called by the name of the CHILD class.
        But you can't call a static method from an interfaces' "child class",
        (it's not technically a child class, it IMPLEMENTS)
        or by the OBJECT's name, because interfaces sometimes have multiple inheritance, 2 interfaces might have
        same-named methods, and so you need to specify from WHICH interface you want to call the method.
         */

    }
}
