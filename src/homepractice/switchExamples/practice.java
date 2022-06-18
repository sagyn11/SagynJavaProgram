package homepractice.switchExamples;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a day of a week");
        String weekday = sc.nextLine();

        switch (weekday) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("weekday");
            case "Saturday", "Sunday" -> System.out.println("weekend");
            default -> System.out.println("Invalid input");
        }
    }
}
