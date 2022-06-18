package com.java.class20;
//write a program that print:
//98765
//9876
//987
//98
//9
public class PatternExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            int k = 10;
            for (int j = 1; j<=6-i; j++){
             k--;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
