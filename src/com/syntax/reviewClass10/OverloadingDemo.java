package com.syntax.reviewClass10;

public class OverloadingDemo {
    static void add(int a, int b){
        System.out.println(a+b);
        System.out.println("1");
        System.out.println();
    }

//    static void add(double a, int b){
//        System.out.println(a+b);
//        System.out.println("2");
//        System.out.println();
//    }

    static void add(double a, double b){
        System.out.println(a+b);
        System.out.println("3");
        System.out.println();
    }

    public static void main(String[] args) {
        add(10, 20);

        add(10.5, 12);
        //int gets "implicitly cast" by Java to a double to make it fit an available method

        add(10.2, 13.6);
    }
}
