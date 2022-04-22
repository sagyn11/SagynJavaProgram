package homepractice.class16;

public class MethodsExamples {
    public static void main(String[] args) {

        welcome();
        multiply(10, 20);
        divisible(50, 5);
        addition(20, 30);
        subtraction(50,10);
    }
    public static void welcome() {
        System.out.println("Welcome to my calculator");
    }
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    public static void divisible(int a, int b) {
        System.out.println(a / b);
    }
    public static void addition(int a, int b) {
        System.out.println(a + b);
    }
    public static void subtraction(int a, int b) {
        System.out.println(a - b);
    }
}