package com.syntax.class19;

/*
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package and observe result.
 */

public class HW1 {

    //The constructors need different parameters!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    private HW1(int a){
        System.out.println("1. Private");
    }

    HW1(double a){
        System.out.println("2. Default");
    }

    protected HW1(String a){
        System.out.println("3. Protected");
    }

    public HW1(boolean a){
        System.out.println("4. Public");
    }



    public static void main(String[] args) {
        new HW1(10);
        new HW1("blah blah blah");
        new HW1(10.12);
        new HW1(true);

       /*
       Same class, I see everything
        */

    }

}
