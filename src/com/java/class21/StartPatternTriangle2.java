package com.java.class21;

public class StartPatternTriangle2 {
    public static void main(String[] args) {
        int num = 25343;

        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
