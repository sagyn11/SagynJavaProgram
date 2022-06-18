package com.java.class21;

public class PatterProgram3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int a = 1; a<=10-i; a++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int j = i-1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}