package com.java.class33;

class ChaseBank extends Bank{
   @Override
    public void displayInterestRate(){
       super.displayInterestRate();
       System.out.println("7.0%");
    }
}

class WellsFargo extends Bank{
   @Override
    public void displayInterestRate() {
       super.displayInterestRate();
       System.out.println("5.0%");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.displayInterestRate();

        WellsFargo wf = new WellsFargo();
        wf.displayInterestRate();
    }

}
