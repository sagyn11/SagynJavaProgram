package com.java.class05;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("Numbers are equal");
        }else{
            if(num1>num2){
                System.out.println("Number 1 is greater than Number 2");
            }else{
                System.out.println("Number 2 is greater than 1");
            }
        }
    }



}
