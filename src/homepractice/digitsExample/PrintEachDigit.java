package homepractice.digitsExample;
//write a program to print each digit of number into each line
public class PrintEachDigit {
    public static void main(String[] args) {
        int num = 25343;

        while (num>0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
