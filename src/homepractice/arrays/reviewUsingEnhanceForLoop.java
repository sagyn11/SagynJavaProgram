package homepractice.arrays;

// Find maximum number
// Find index of number
// Get sum of arrays
// Get average of arrays
public class review {
    public static void main(String[] args) {
        int data[] = {25, 75, 25, 65, 85};
        System.out.println(getMaxNum(data));
        Line();
        System.out.println(getIndexOfNum(data,85));
        Line();
        System.out.println(getSumOfArrays(data));
        Line();
        System.out.println(getAvgNum(data));
        Line();
    }

    static int getMaxNum(int data[]) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    static int getIndexOfNum(int data[], int num){
        for (int i = 0; i < data.length; i++){
            if (data[i]==num){
                return i;
            }
        }
        return -1;
    }
    static int getSumOfArrays(int data[]){
        int sum = 0;
            for (int i = 0; i < data.length; i++){
                sum=sum+data[i];
            }
            return sum;
    }
    static double getAvgNum(int data[]){
        double avgNum=0;
            for (int i = 0; i < data.length; i++){
                avgNum=avgNum+data[i];
            }
           return avgNum/ data.length;
    }
    static void Line(){
        System.out.println("======================");
    }
}
