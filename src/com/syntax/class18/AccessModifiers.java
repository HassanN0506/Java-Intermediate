package com.syntax.class18;

public class AccessModifiers {

    //private:
    private String name="Tarik";

    //default:
    int age=50;

    //protected:
    protected double weight=100;

    //public:
    public String color="White";

    public static void main(String[] args) {

        AccessModifiers am=new AccessModifiers();
        System.out.println(am.name); //private
        System.out.println(am.age); //default
        System.out.println(am.weight); //protected
        System.out.println(am.color); //public


    }

}
