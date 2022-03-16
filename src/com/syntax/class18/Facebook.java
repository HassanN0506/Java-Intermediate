package com.syntax.class18;

public class Facebook {

    private String username;
    private String password;
    private int age;

    void setAge(int personAge){
        if(personAge>5 && personAge<80){
            age=personAge;
        } else{
            System.out.println("Not allowed");
        }
    }


}
