package com.syntax.class29;

import java.util.TreeSet;

public class Recap {
    public static void main(String[] args) {
        TreeSet<Character> letters=new TreeSet<>();
        letters.add('a');
        letters.add('B'); //comes first in ascending order, so is sorted in front of 'a'
        System.out.println(letters);
    }
}
