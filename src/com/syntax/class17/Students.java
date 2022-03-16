package com.syntax.class17;

 /* HOMEWORK
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment the numberOfStudents for each object
    Print out  total number of students
     */

public class Students {

    String name;
    String  ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        s1.name="Alex";
        s1.ID="1";
        s1.numberOfStudents++;

        s2.name="Bob";
        s2.ID="2";
        s2.numberOfStudents++;

        s3.name="Chris";
        s3.ID="3";
        s3.numberOfStudents++;

        System.out.println("Total number of students: "+numberOfStudents);
    }

}
