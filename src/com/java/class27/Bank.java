package com.java.class27;

public class Bank {

    int balance;
    String accNumber;
    String accName;

    void deposit(int amount){
        System.out.println("deposited "+amount+" into "+accName+"'s account");
        balance = balance + amount;
    }

    void withdraw(int amount){
        System.out.println("withdrawing "+amount+" from "+accName+"'s account");
        balance = balance - amount;
    }

    void displayBalance(){
        System.out.println(accName+"'s balance = "+balance);
    }
}
