package com.java.class31;


class Bank {
    Bank(){
        System.out.println("from Bank Class Constructor");
    }
}

class HSBCBank extends Bank{
    HSBCBank(){
        System.out.println("From HSBCBank Class Constructor");
    }
}


public class ConstructorChaining {
    public static void main(String[] args) {
        HSBCBank b = new HSBCBank();
    }
}
