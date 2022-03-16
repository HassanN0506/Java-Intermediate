package com.syntax.class17;

public class SyntaxEmployee {
    /*
    Create a Class called Employee:
    Create three  variables  empID , salary and set the CEO to â€œSumairâ€
    Create two objects of the class Employee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */

    String empID;
    double salary;
    static String CEO="Asghar";

    public static void main(String[] args) {
        SyntaxEmployee asel = new SyntaxEmployee();
        asel.empID="As-123";
        asel.salary=200000;
        System.out.println(asel.empID);
        System.out.println(asel.salary);
        System.out.println(SyntaxEmployee.CEO);//GOOD PRACTICE SYNTAX
        //System.out.println(asel.CEO);
        // BAD PRACTICE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println();

        SyntaxEmployee mozzam = new SyntaxEmployee();
        mozzam.empID="Mo-456";
        mozzam.salary=175000;
        System.out.println(mozzam.empID);
        System.out.println(mozzam.salary);
        System.out.println(SyntaxEmployee.CEO);

    }

}
