package homepractice.methodExamples2;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        line();
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(EvenNum(num));
        line();
    }
    public static void line(){
        System.out.println("===============");
    }
    public static boolean EvenNum(int num){
        return num % 2 == 0;
    }

}
