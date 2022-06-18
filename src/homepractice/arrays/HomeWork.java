package homepractice.arrays;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        SumOfArray();
        PrintLine();
        System.out.println("Task2:");
        AverageOfArray();
        PrintLine();
        System.out.println("Task 3: ");
        FindIndex();
        System.out.println("Task 4:");
        MaxNum();
        PrintLine();
    }
    public static void SumOfArray(){
        int data[]={5,2,3,6,1};
        int sum = 0;
            for (int i = 0; i < data.length;i++){
                sum = sum+data[i];
            }
        System.out.println(sum);
    }
    public static int AverageOfArray(){
        int data[] = {5,6,4,3,2};
        int num = 0;
        int count = 0;
        double average = 0;
            for (int i = 0; i < data.length; i++){
                num=num+data[i];
                count++;
            }
            average = num / count;
        System.out.println(average);
        return num;
    }
    public static void FindIndex(){
        int data[] = {5,6,4,3,2};
        int num = 4;
        for (int i = 0; i < data.length; i++){
            if (data[i]==num){
                System.out.println(data[4]);
            }
        }
    }
    public static void MaxNum(){
        int data[] = {5,6,4,3,2};
        int max = data[0];
            for (int i = 1; i < data.length;i++){
                if (data[i]>max){
                    max=data[i];
                }
            }
        System.out.println(max);
    }
    public static void PrintLine(){
        System.out.println("===================");
    }
}
