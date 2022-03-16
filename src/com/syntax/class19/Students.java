package com.syntax.class19;

/*
task:
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each student's name.
 */

public class Students {

    String name;
    int mathGrade;
    int scienceGrade;
    int historyGrade;

    public Students(String name, int mathGrade, int scienceGrade, int historyGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
    }

    void printAverage(){
        System.out.println(name+": "+((mathGrade+scienceGrade+historyGrade)/3));
    }

}
