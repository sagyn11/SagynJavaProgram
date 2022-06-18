package com.java.class28;

public class Car {

String name;
int year;


    Car(String carNameFromUSer, int carYearFromUSer){
     name = carNameFromUSer;
     year = carYearFromUSer;
    }

    public void carConfig(){
        System.out.println(name);
        System.out.println(year);
    }

}
