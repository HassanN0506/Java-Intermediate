package com.syntax.class19;

public class PandaTester {

    public static void main(String[] args) {
        Panda panda=new Panda("Deebo");
        //calls the specific constructor that ONLY has the stringName parameter
        //and the rest of the variables are set to their default values (the values we set)
        panda.printInfo();

        Panda p2=new Panda("Jojo", "Mellow yellow", 12);
        p2.printInfo();
        //calls the SPECIFIC constructor w/ parameters of pName, pColor, and pAge
        //knows which constructor to call based on the data types of the arguments we pass

        //(putting a value inside the parenthesis is PASSING an ARGUMENT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!)

    }

}
