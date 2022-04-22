package homepractice.class18;
//Write a program to print all even numbers which are divisible by 6 from 1 to 50
public class HomeWork2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (divNum(i) == true) {
                System.out.println(i);
            }
        }
    }

    static boolean divNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % 6 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

