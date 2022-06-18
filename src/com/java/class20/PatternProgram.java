package com.java.class20;

public class PatternProgram {
    public static void main(String[] args) {
        for (int i = 5; i <= 9; i++){
            for (int a = 9; a >= i; a--){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
