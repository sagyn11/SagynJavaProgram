package com.java.class19;

public class HW {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (moreThanFiveDivisor(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean moreThanFiveDivisor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
