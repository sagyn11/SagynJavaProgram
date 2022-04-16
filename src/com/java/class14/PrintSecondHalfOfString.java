package com.java.class14;

import java.util.Scanner;
// write a program to print 2nd half of String

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Please enter any String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(str.length()/2+1));



    }


}
