package homepractice.patternExamples;

//1
//33
//555
//7777
//99999
public class homeWork {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(2 * i - 1);
            }
            System.out.println();
        }
    }
}
