package com.java.class21;

public class StartPatternTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int a = 1; a<=5-i; a++) {
                System.out.print(" ");
            }
                for (int j = 1; j<=i*2-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

