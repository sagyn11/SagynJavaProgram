package homepractice.class17;
// write a program to print all numbers from 1 to 50 which has more than 5 divisor
public class HomeWork1 {
    public static void main(String[] args) {
        for (int i = 1; i<=50; i++){
            if (moreFiveDivisor(i)==true){
                System.out.print(i + " ");
            }
        }
    }
        static boolean moreFiveDivisor(int num){
            int div=0;
            for (int i = 1; i<=50; i++){
                if (num % i == 0){
                 div++;
                }
            }
            if (div>=5){
                return true;
            }else {
                return false;
            }
        }
}
