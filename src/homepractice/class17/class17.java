package homepractice;

import java.util.Scanner;

// write a program to find out divisible number
public class class17 {

    // Take number from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
