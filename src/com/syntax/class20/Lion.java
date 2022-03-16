package com.syntax.class20;

public class Lion extends Animal{

    boolean mane=true;

    void roar(){
        System.out.println(name+" is roaring"+" and is "+color);
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name="Leroy";
        lion.color="Golden";
        lion.sleep();
        lion.roar();
    }
}
