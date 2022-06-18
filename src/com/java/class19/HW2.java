package com.java.class19;

public class HW2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int a = 1; a <= 6 - i; a++) {
                System.out.print(6 - a);
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int a = 5; a >= i; a--) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
