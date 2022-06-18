package com.java.class26;

public class findMinimumFromArray {
    public static void main(String[] args) {

        int[] data = {30,40,10,50,32};

            int minNum = data[0];
            for (int num : data){
                if (num < minNum){
                    minNum = num;

                }
            }
        System.out.println(minNum);
    }
}
