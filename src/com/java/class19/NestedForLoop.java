package com.java.class19;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j <= 5; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}