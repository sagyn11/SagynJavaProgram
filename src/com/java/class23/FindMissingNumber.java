package com.java.class23;

//write a program to find missing number from an array
public class FindMissingNumber {
    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        int sum = 0;
        int sumOfArray = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        for (int num : data) {
            sumOfArray = sumOfArray + num;
        }
        System.out.println("Missing number " + (sum - sumOfArray));
    }
}


