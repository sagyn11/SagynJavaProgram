package homepractice.class17;

import java.util.Locale;
import java.util.Scanner;

public class MethodExamples {

    static void printLine(int length, char symbol) {
        for (int i = 1; i <= length; i++){
            System.out.print(symbol);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printLine(30, '=');
        System.out.println("Please enter first number: ");
        printLine(30, '=');
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        printLine(50, '*');
        System.out.println("Please enter second number: ");
        printLine(50, '*');
        int b = sc.nextInt();

        printLine(100, '$');
        System.out.println("choose operation: ");
        printLine(100, '$');
        String operation = sc.next();

        switch (operation.toLowerCase(Locale.ROOT)) {
            case "add": System.out.println(a + b);break;
            case "sub": System.out.println(a - b);break;
            case "mul": System.out.println(a * b);break;
            case "div": System.out.println(a / b);break;
            default: System.out.println("Invalid choice");
        }
    }
}
