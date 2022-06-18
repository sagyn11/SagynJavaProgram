package homepractice.patternExamples;

public class patternExamples {
    public static void main(String[] args) {
        printLine(30, '=');
        System.out.println("First pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        printLine(30, '=');
        System.out.println("Second pattern:");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        printLine(30, '=');
        System.out.println("Third pattern:");
            for (int i = 5; i >= 1; i--){
                for (int j = 5; j >= i; j--){
                    System.out.print(j);
                }
                System.out.println();
            }
        printLine(30, '=');
        System.out.println("Fourth pattern");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(2*i-1);
            }
            System.out.println();
        }
        printLine(30, '=');
    }
    static void printLine(int length, char c) {
        for (int i = 1; i <= length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}