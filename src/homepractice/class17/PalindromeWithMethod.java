package homepractice.class17;

import java.util.Scanner;

//write a program to check given string is palindrome or not
public class PalindromeWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = getReverse(str);

        if (str.equals(rev)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }

    static String getReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
