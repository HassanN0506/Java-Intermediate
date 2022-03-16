package com.syntax.class19;

public class StudentTester {

    public static void main(String[] args) {
        Students s1=new Students("A", 99, 99, 99);
        s1.printAverage();

        Students s2=new Students("B", 98, 98, 98);
        s2.printAverage();

        Students s3=new Students("C", 97, 97, 97);
        s3.printAverage();

        Students s4=new Students("D", 96, 96, 96);
        s4.printAverage();

        Students s5=new Students("E", 95, 95, 95);
        s5.printAverage();


        //i can also do Method Chaining:
        new Students("Hassan", 100, 99, 98).printAverage();
        //before, i was creating an object, storing it in a variable, and then calling the printAverage method on that VARIABLE
        //but now, i am simply calling the printAverage method directly on an object that i've created ONLY for the purpose
        // of calling that method on this here specific object
    }

}
