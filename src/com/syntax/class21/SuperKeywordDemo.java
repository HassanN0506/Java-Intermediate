package com.syntax.class21;

class Grandparent{
    String color ="Blue";

    void printInfo(){
        System.out.println("I am grandpa");
    }
}

class Parent extends Grandparent{
    String color="Black";

    void printInfo(){
        System.out.println("I am parent");
    }
}

class Child extends Parent{
    String color="Red";

    void printColor(){

        String color="Green";

        System.out.println(color);
        /* Green, because we've re-assigned 'color' from Black to Red inside this Child class,
        HOWEVER, that doesn't even matter, because in this line we're referring to the LOCAL variable 'color'
        (not the instance variable), which we've created and assigned to "Green". */

        System.out.println(this.color);
        //Red, because we've re-assigned the instance variable 'color' from Black to Red inside this Child class

        System.out.println(super.color);
        //Black, because the keyword "super" always shows the BASE CLASS'S value of the referred variable ('color')

        //NOT BLUE (from Grandparent class), because "super" keyword prefers the CLOSEST parent class's value,
        // AKA the Immediate parent class's value,
        // when it comes to Hierarchical inheritance !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }


    void printInfo(){
        System.out.println("I am child");
    }

    void print(){
        printInfo();
    }

    void printParent(){
        super.printInfo();
    }
    /*
    Like nesting a method within another method
    using inheritance to get the code I need
    and Super keyword to specify what I want to print
     */
    //Super keyword limits me to the base class's values, though
    //so I can't call printInfo() for Grandpa....
}


public class SuperKeywordDemo{
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();

        child.print();
        child.printParent();
    }

}
