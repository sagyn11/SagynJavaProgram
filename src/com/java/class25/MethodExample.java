package com.java.class25;

import java.util.Scanner;
public class MethodExample {
    public static void main(String[] args) {
        int num = 10;
        method1(num);
        System.out.println(num);
    }

    static int method1(int num){
        return num * 10;
    }




    static int getNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        return num;
    }


    }

