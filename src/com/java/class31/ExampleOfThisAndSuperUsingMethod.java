package com.java.class31;

class ParentClass{
    public void printData(){
        System.out.println("1. Parent class");
    }
}

class ChildClass extends ParentClass{
    public void printData(){
        System.out.println("2. Child Class Method");
        printData();
        // super.printData(); - this will call super class method so no recursion
    }
}
public class ExampleOfThisAndSuperUsingMethod {
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.printData();
    }
}
