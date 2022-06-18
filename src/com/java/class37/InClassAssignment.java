package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InClassAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("Please try after hangover");
        }
        System.out.println("the end of the program");

    }
}
