package com.java.class37;

public class ExceptionWithFinally {
    public static void main(String[] args) {
        int num[] = {32,45,74,65,12};

        try {
            System.out.println(num[5]);

        }finally {
            System.out.println("Browser close");
        }

    }
}
