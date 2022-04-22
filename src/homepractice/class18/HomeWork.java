package homepractice.class18;

//Write a program to print all numbers from 1 to 50 which has more than 5 divisor
public class HomeWork {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (moreDivisor(i) == true) {
                System.out.println(i);
            }
        }
    }

    static boolean moreDivisor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 5) {
            return true;
        } else {
            return false;
        }
    }

}
