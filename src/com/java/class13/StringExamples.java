package com.java.class13;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = "DevX";
        String str2 = "DevX";
        String str3 = sc.nextLine();

        if (str1 == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str1 == str3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str1.equals(str3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}



