package com.java.class29;

public class ClassExample {
    public static void main(String[] args) {

        int a = 10, b = 20;
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
