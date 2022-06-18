package com.java.class33;

class Messi extends FootballStar{
    @Override
    public void displayYearSalary() {
        super.displayYearSalary();
    }
}

class Ronaldo extends FootballStar{
    @Override
    public void displayYearSalary() {
        System.out.println("26 000 000");;
    }
}

class Neymar extends FootballStar{
    @Override
    public void displayYearSalary() {
        System.out.println("40 000 000");;
    }
}


public class MethodOverridingExampleFootball {

    public static void main(String[] args) {
        Messi cc = new Messi();
        cc.displayYearSalary();

        Ronaldo bb = new Ronaldo();
        bb.displayYearSalary();

        Neymar aa = new Neymar();
        aa.displayYearSalary();

    }

}
