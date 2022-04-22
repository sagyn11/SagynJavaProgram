package homepractice.class18;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = getReverse(str);
        if (str.equals(rev)){
            System.out.println("It's palindrome");
        }else{
            System.out.println("it's not palindrome");
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

