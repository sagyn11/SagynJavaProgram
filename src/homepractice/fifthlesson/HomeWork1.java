package homepractice.fifthlesson;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Write some given number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if(num % 5 == 0){

        System.out.println("Devided by 5");
        }else{
        System.out.println("Not devided by 5");
    }
}


}
