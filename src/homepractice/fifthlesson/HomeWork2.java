package homepractice.fifthlesson;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("enter any year");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if(num % 4 == 0){
        System.out.println("Leap year");
    }else{
        System.out.println("Not Leap yaer");
    }

    }




}
