package com.java.class26;

public class ArrayExample {
    public static void main(String[] args) {

        int[] data = {20, 30, 40, 60, 80};

        System.out.println(data.length);
        System.out.println(data[4]);

            // print all numbers form array
            for (int i = 0; i < data.length; i++){
                System.out.println(data[i]);
            }

            // print all numbers from array using for each loop / enhance for loop
                for (int num  : data){
                    System.out.println(num);
        }
    }
}
