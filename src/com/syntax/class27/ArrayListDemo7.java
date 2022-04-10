package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo7 {

    public static void main(String[] args) {

        List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd');
        System.out.println(alphabet);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1, 100);
        //computer does a lot of work to change an arrayList


        //computer has an easier time changing a linked list
        //linked-list takes longer to find a specific element though, because of pointer system
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(1, 100);

    }
}
