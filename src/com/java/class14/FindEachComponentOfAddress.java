package com.java.class14;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
    String address = "B604, Cosmos Society, Megarpatta city, Pune, 720045";
    String [] words = address.split(",");
        System.out.println(words[0].trim());
        System.out.println(words[1].trim());
        System.out.println(words[2].trim());
        System.out.println(words[3].trim());
        System.out.println(words[4].trim());
    }
}