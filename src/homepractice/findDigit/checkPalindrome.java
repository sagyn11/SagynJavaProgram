package homepractice.findDigit;
//34356
public class checkPalindrome {
    public static void main(String[] args) {
       int num = 121;
       int rev = 0;
       int backUpOriginalNum = num;

       while (num > 0){
           int lastDigit = num % 10;
           rev = rev * 10 + lastDigit;
           num = num / 10;
       }

       if (backUpOriginalNum == rev){
           System.out.println("it's a palindrome");
       }else {
           System.out.println("not palindrome");
       }
    }
}
