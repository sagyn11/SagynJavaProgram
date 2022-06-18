package com.java.class27;

public class HumanTester {

    public static void main(String[] args) {

        Human a1 = new Human();
        a1.name = "Sagyn";
        a1.surname = "Taldybaev";
        a1.age = 28;
        a1.nationality = "kyrgyz";
        a1.weight = 84.54;

        a1.voice("Hello, my name is "+a1.name + " "+a1.surname+", i am a "+ a1.nationality);
        System.out.println("I am gonna walk "+a1.walk(10)+" miles");
        a1.eat("pasta");

    }
}
