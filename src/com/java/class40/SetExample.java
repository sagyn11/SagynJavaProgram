package com.java.class40;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> listOfItems = new HashSet<String>();

        listOfItems.add("Chirag");
        listOfItems.add("Chirag");
        listOfItems.add("Chirag");
        listOfItems.add("Rahim");
        listOfItems.add("Rahim");
        listOfItems.add("Alex");
        listOfItems.add("Liz");
        listOfItems.add("Ayida");

        System.out.println(listOfItems);
    }
}
