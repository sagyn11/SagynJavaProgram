package homepractice.methodExamples;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number");
        double first = sc.nextDouble();
        System.out.println("Second number");
        double second = sc.nextDouble();
        System.out.println("Third number");
        double third = sc.nextDouble();
        System.out.println(averageNumber(first,second,third));
    }

    public static double averageNumber(double a, double b, double c) {
            return (a+b+c) / 3;

    }
}
