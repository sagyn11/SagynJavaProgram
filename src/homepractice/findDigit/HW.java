package homepractice.findDigit;

public class HW {
    public static void main(String[] args) {
        System.out.println("Task 1");
        countNum();
        PrintLine();
        System.out.println("Task 2");
        revNum();
        PrintLine();
        System.out.println("Task 3");
        PalNum();
        PrintLine();
        System.out.println("Task 4");
        MaxNum();
        PrintLine();

    }
      public static void countNum(){
        int num = 4345;
        int count = 0;
            while (num != 0){
                count++;
                num=num/10;
            }
          System.out.println(count);
      }

        public static void revNum(){
        int num = 4345;
        int rev = 0;

            while (num != 0){
                int lastDigit = num % 10;
                rev = rev * 10 + lastDigit;
                num = num / 10;
            }
            System.out.println(rev);
        }
        public static void PalNum(){
        int num = 12321;
        int rev = 0;
        int sum = num;
                while (num!=0){
                    int lastDigit = num % 10;
                    rev = rev * 10 + lastDigit;
                    num = num / 10;
                }

            if (sum==rev){
                System.out.println("It's a palindrome");
            }else {
                System.out.println("It's not a palindrome");
            }

        }
        public static void MaxNum(){
        int num = 43463458;
        int maxNum = 0;
        while (num != 0){
            if (num % 10 > maxNum){
                maxNum = num % 10;
            }
            num = num / 10;
        }
            System.out.println(maxNum);
        }

    public static void PrintLine(){
        System.out.println("==================");
    }
}
