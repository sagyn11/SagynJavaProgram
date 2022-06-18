package homepractice.arrays;

public class twoDimentionArray {
    public static void main(String[] args) {

        int nums[][] = {{1,2,3},{5,4,2},{5,7,1},{4,2,1}};
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
