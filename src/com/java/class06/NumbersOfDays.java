package com.java.class06;

import java.util.Scanner;

public class NumbersOfDays {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int daysNum = sc.nextInt();

        if (daysNum == 1) {
            System.out.println("Jan has 31 days");
        } else if (daysNum == 2) {
            System.out.println("Feb has 28 days");
        } else if (daysNum == 3) {
            System.out.println("Mar has 31 days");
        } else if (daysNum == 4) {
            System.out.println("Apr has 30 days");
        } else if (daysNum == 5) {
            System.out.println("May has 31 days");
        } else if (daysNum == 6) {
            System.out.println("Jun has 30 days");
        } else if (daysNum == 7) {
            System.out.println("Jul has 31 days");
        } else if (daysNum == 8) {
            System.out.println("Aug has 31 days");
        } else if (daysNum == 9) {
            System.out.println("Sep has 30 days");
        } else if (daysNum == 10) {
            System.out.println("Oct has 31 days");
        } else if (daysNum == 11) {
            System.out.println("Nov has 30 days");
        } else if (daysNum == 12) {
            System.out.println("Dec has 31 days");
        }

    }


}
