package com.syntax.class24;

public  class Parent {
    final String name="Vladlen";
    final void method(){
        // name="Mr.a"; can reassign if a variable is final
        System.out.println("i am parent");
    }
    void method2(){

    }
}

class Child extends Parent{

   /* void method(){
        can't override because it is final method
    }*/
}