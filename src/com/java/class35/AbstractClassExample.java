package com.java.class35;

class Bank {
    public void displayRateOfInterest() {
        System.out.println("6.0%");
    }
}

class ChaseBank extends Bank {
    public void displayRateOfInterest() {
        System.out.println("0.01%");

    }
}

class CityBank extends Bank {
    public void displayRateOfInterest() {
        System.out.println("0.06%");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.displayRateOfInterest();
    }
}

