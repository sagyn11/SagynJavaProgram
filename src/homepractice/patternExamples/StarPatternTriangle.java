package homepractice.patternExamples;

public class StarPatternTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++){

            for (int s = 1; s <= 15-i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i = 14; i >= 1; i--){

                for (int s = 1; s <= 15-i; s++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
