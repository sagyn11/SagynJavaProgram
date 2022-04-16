package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Please enter the price");
        Scanner num = new Scanner(System.in);
        int price = num.nextInt();

        if (price < 100) {
            System.out.println("No discount");
        } else if (price < 500) {
            System.out.println("You have 5 % discount");
        } else if (price < 1000) {
            System.out.println("You have 10 % discount");
        } else if (price >= 1000) {
            System.out.println("You have 15 % discount");
        }

    }
}



