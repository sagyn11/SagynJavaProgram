package homepractice.methodExamples;

import java.util.Scanner;

public class practiceInHome {
    public static void main(String[] args) {
        System.out.println(EvenOrNot(52));
        Line();
        System.out.println(EvenOrNot(87));
        Line();
        System.out.println(EvenOrNot(88));
        Line();
        System.out.println(EvenOrNot(94));
        Line();
        System.out.println(EvenOrNot(99));
        Line();
    }
    public static boolean EvenOrNot(double number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void Line(){
        System.out.println("================================");
    }
}

