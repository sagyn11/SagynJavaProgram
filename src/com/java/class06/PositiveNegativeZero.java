package com.java.class06;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        // write a program to check given number is positive/ neg/ or zero
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive");

        } else if (num < 0) {
            System.out.println(num + " is Negative");

        } else {
            System.out.println(" is Zero");
        }
    }


}






