package com.java.class15;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string, i will reverse it");
        String str = sc.nextLine();
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
