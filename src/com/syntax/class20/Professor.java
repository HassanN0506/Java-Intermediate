package com.syntax.class20;
/*
Write a Java program called Teacher. Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
Test all 4 classes
    */
public class Professor {
    String name;
    char gender;
    int age;
    String specialty;

    void teaches(){
        System.out.println(name+" teaches "+specialty);
    }

    void onBreak(){
        System.out.println(name+" is on break");
    }

}


class MathProfessor extends Professor{
    boolean isHelpful;

    void useCalculator(){
        System.out.println(name+" is using the calculator");
    }


    public static void main(String[] args) {
        MathProfessor pete = new MathProfessor();
        pete.name="Pete";
        pete.isHelpful =false;
        pete.onBreak();
    }
}


class ChemistryProfessor extends Professor{
    boolean isPrepared;

    void mixChemicals(){
        System.out.println(name+" is mixing chemicals");
    }


    public static void main(String[] args) {
        ChemistryProfessor will = new ChemistryProfessor();
        will.name="Will";
        will.isPrepared=true;
        will.specialty="Chemistry";
        will.mixChemicals();
        will.teaches();
    }
}


class PianoProfessor extends Professor{
    boolean isCreative;

    void listenToMusic(){
        System.out.println(name+" is listening to music");
    }


    public static void main(String[] args) {
        PianoProfessor carol = new PianoProfessor();
        carol.name="Carol";
        carol.specialty="Piano lessons";
        carol.isCreative=true;
        carol.teaches();
        carol.onBreak();
        carol.listenToMusic();
    }
}

