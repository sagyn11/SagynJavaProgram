package homepractice.class17;

import java.util.Scanner;

public class primeNumberUsingBoolean {
    public static void main(String[] args) {
        System.out.println("Please enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
