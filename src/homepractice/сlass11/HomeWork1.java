package homepractice.сlass11;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any numbers");
        int num = sc.nextInt();
        int i = 1;

        while (i <= num) {
            System.out.println(i * 3);
            i++;
        }
    }
}





