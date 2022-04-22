package com.java.class16;

import java.util.Scanner;

public class PrimeNumberUsingBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            System.out.println("We are dividing "+num+" with "+i);
            if (num % i == 0) {
            isPrime = false;
            break;
            }
        }
            if (isPrime==true){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }