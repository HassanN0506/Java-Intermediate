package com.syntax.class24;

public class Homework {}

  /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */

abstract class File1{
    abstract void open();
    void edit(){
        System.out.println("Editing");
    }
    void close(){
        System.out.println("Closing");
    }
}

class JavaFile1 extends File1 {
    @Override
    void open() {
        System.out.println("Opening Java file");
    }
}

class WordFile1 extends File1{
    @Override
    void open() {
        System.out.println("Opening Word file");
    }
}

class PdfFile1 extends File1{
    @Override
    void open() {
        System.out.println("Opening PDF file");
    }
}

class File1Test{
    public static void main(String[] args) {
        File1[] files = {new JavaFile1(), new WordFile1(), new PdfFile1()};
        for (File1 a: files
             ) {
            a.open();
            a.edit();
            a.close();
            System.out.println();
        }
    }
}

