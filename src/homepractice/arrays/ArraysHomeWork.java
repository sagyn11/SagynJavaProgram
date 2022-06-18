package homepractice.arrays;

//Find sum of Individual row in 2D array
//        Example input:
//        3 4 6
//        7 6 4
//        9 9 2
//        Output :
//        Sum of  row1 = 13
//        Sum of  row2 = 17
//        Sum of row3 = 20
public class ArraysHomeWork {
    public static void main(String[] args) {
        int[][] data = {{3, 4, 6}, {7, 6, 4}, {9, 9, 2}};
        for (int i = 0; i < data.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < data[i].length; j++) {
                sumRow = sumRow + data[i][j];

            }
            System.out.println("Sum of row: " + (i + 1) + " = " + sumRow);
        }
        System.out.println();
        // Find Transpose
        System.out.println("============================");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[j][i]);
            }
            System.out.println();
        }
    }
}