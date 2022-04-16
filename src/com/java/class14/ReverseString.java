package com.java.class14;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Please enter any String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);

    }


}
