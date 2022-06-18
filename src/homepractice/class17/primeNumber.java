package homepractice.class17;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("please enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("it's not a prime number");
        }
    }
}
