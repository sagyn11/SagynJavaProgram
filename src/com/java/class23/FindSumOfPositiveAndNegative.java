package com.java.class23;

public class FindSumOfPositiveAndNegative {
    public static void main(String[] args) {

        int data[] = {5,8,2,-4,-13,3,-7,12};

        int posNum = 0; int negNum = 0;

            for (int i = 0; i < data.length;i++){
                if (data[i]>0){
                    posNum=posNum+data[i];
                }else {
                    negNum=negNum+data[i];
                }
            }
        System.out.println("Positive number is: " + posNum);
        System.out.println("Negative number is: " + negNum);
    }
}
