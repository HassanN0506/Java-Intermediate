package com.syntax.class28;

import java.util.LinkedList;


class Student{

    String name;
    int age;
    String hobbies;

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    //we need to override this class' default toString method in order to see its objects' values
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
     /*
    to override the default toString method,
    type 'to'
    and select the toString autofill
    :)
     */
}


public class ListDemo2 {

    public static void main(String[] args) {

        Student hassan = new Student("Hassan", 24, "nothing");
        Student emilia = new Student("Emilia", 20, "study");
        Student micheal = new Student("Micheal", 28, "memes");

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(hassan);
        studentLinkedList.add(emilia);
        studentLinkedList.add(micheal);

        System.out.println(studentLinkedList);
        //we had to OVERRIDE the default toString method for the Student class in order to see the objects' values.
        //(because here we're technically using the toString method, and by default it return's the objects' memory location)

    }
}


