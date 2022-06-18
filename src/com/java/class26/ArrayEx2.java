package com.java.class26;

public class ArrayEx2 {
    public static void main(String[] args) {

        int[] data = {35,42,10,65,70};

            int minArray = data[0];
            int maxArray = data[0];

                for (int num:data){
                    if (num < minArray){
                        minArray = num;
                    }
                    else if (num > maxArray){
                        maxArray = num;
                    }
                }
        System.out.println("Smallest num is "+minArray);
        System.out.println("Biggest num is "+maxArray);
    }
}
