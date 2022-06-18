package com.java.class26;

public class TwoDArrayExample {
    public static void main(String[] args) {

        int [][] nums = new int[3][2];

        int [][] data = {{1,2,3} , {5,3,1}, {2,6,8}};

        // number of rows
        System.out.println(data.length);

        // number of columns
        System.out.println(data[0].length);
        System.out.println("===================================");

        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
