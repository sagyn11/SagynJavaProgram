package com.java.class24;

public class CountNumberOfOddEvenFromArray {
    public static void main(String[] args) {
        int data[] = {34, 6, 7, 23, 8, 90, 35, 76};
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println("Count of even num is " + evenNum);
        System.out.println("Count of odd num is " + oddNum);
    }
}
