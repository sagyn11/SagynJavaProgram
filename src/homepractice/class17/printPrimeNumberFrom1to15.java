package homepractice.class17;

// print all prime number from 1 to 50
public class printPrimeNumberFrom1to15 {
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
}
