package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numberList = new ArrayList<>();
        Double double1 = new Double(10.5);

        double number = double1.doubleValue();
        //this converts it form a Wrapper to a Primitive again
        //Manual "Unboxing"

        Double number2 = new Double(number);
        //Manual"Boxing"
        //converts from primitive to wrapper


        double number3 = 10.5;
        Double number4 = number3;//AUTO Boxing
        number3=number4; //AUTO UNboxing:


    }
}
