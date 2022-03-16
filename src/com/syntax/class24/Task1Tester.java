package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
        /*in java we can store the object of a child classes
        in a parent type variable*/
        //Every class in java can be treated as data type
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
      /*
      as we can store the object of a child class in a parent class
      we can also create an array of these students as show below
       */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(),
                new CollegeStudent()};
   /*  int[] arr={1,2,3};
        for (int number:arr
             ) {
            System.out.println(number);
        }*/
        //students[0].practice();
        for (Student student : students
        ) {
            //calling the methods from all the children classes
            student.study();
            student.doHomeWork();
            student.practice();
        }


    }
}
