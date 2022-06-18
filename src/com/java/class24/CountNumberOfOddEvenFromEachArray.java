package com.java.class24;

public class CountNumberOfOddEvenFromEachArray {
    public static void main(String[] args) {
        int[][] data = {{34, 6, 7, 23, 8, 90, 35, 76},
                {53, 23, 65, 12, 5, 2, 5, 7},
                {34, 6, 2, 33, 7, 3, 2, 6}};

        for (int i = 0; i < data.length; i++) {
            int evenNum = 0;
            int oddNum = 0;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
            }
            System.out.println("In row " + (i + 1) + ": " + evenNum + " even and " + oddNum + " odd numbers");
        }

    }
}
