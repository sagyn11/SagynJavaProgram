package com.java.class27;

public class BankTester {

    public static void main(String[] args) {

        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.balance = 1000;
        b1.accName = "Sagyn";
        b1.accNumber = "2985";

        b1.deposit(2000);
        b1.withdraw(300);
        b1.displayBalance();


    }

}
