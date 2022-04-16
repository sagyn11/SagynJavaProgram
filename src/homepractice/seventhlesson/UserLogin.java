package homepractice.seventhlesson;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;

        System.out.println("Enter user name: ");
        user = input.nextLine();

        System.out.println("Enter password: ");
        pass = input.nextLine();

            if (user.equals("Sagyn") && (pass.equals("123"))){
                System.out.println("Welcome Sagyn");
            }else{
                System.out.println("Invalid");
            }
    }

}
