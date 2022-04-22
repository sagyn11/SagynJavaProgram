package com.java.class15;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string, i will find out numbers of word");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);
    }
}
