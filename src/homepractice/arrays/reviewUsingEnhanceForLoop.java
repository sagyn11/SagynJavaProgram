package homepractice.arrays;

// Get sum of arrays
// Get average of arrays
public class reviewUsingEnhanceForLoop {
    public static void main(String[] args) {
        int data[] = {25, 75, 25, 65, 85};

        System.out.println(getSumOfArrays(data));
        Line();
        System.out.println(getAvgNum(data));
        Line();
    }

    static int getSumOfArrays(int data[]) {
        int sum = 0;
        for (int num : data) {
            sum = sum + num;
        }
        return sum;
    }

    static double getAvgNum(int data[]) {
        double avgNum = 0;
        for (int num : data) {
            avgNum = avgNum + num;
        }
        return avgNum / data.length;
    }

    static void Line() {
        System.out.println("======================");
    }
}
