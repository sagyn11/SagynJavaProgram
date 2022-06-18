package com.java.class40;

import java.util.HashSet;
import java.util.Set;

public class InClassAssignment {

    public static void main(String[] args) {

        Set<Integer> listOfNumbers = new HashSet<Integer>();

        listOfNumbers.add(10);
        listOfNumbers.add(10);
        listOfNumbers.add(50);
        listOfNumbers.add(50);
        listOfNumbers.add(100);

        for (Integer item : listOfNumbers) {
            System.out.println(item);
        }


    }
}
