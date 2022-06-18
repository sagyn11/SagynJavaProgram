package com.java.class26;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String str = "      Hello World!       ";
        String str2 = "Hello World";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.trim().equals(str2));

        String str3 = "Welcome to %s classes, %s will guide you";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite programming - ");
        String pl = sc.nextLine();

        System.out.println("Enter your mentor: ");
        String men = sc.nextLine();
        System.out.println(String.format(str3,pl,men));

        // ============= Format ==================
        String str4 = "This is my statement for split";
        String[]words = str4.split(" ");
        for (String word:words){
            System.out.println(word);
        // ============= Sub String =================
            String str6 = "This is java classes";
            System.out.println(str6.substring(5));
        }
    }
}
