package com.java.class08;

import java.util.Scanner;

public class CheckCharIsVowel {
    public static void main(String[] args) {
        System.out.println("Please enter any letters");
        Scanner sc = new Scanner(System.in);
        char input = 'v';

            if (input == 'a' || input == 'e' || input == 'u' || input == 'o' || input == 'i'){
                System.out.println("Vowel");
            }else{
                System.out.println("Not Vowel");
            }
    }
}
