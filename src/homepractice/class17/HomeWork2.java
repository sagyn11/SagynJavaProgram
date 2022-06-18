package homepractice.class17;

//write a program to print all even numbers which are divisible by 6 from 1 to 50
public class HomeWork2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isDivisibleBySix(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isDivisibleBySix(int num) {
        if (num % 6 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
