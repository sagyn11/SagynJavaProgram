package homepractice.StringMethods;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Welcome to the Bishkek";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        str = "unhappys";
        System.out.println(str.substring(2,7));



    }
}
