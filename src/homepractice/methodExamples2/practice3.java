package homepractice.methodExamples2;

public class practice3 {
    public static void main(String[] args) {

        sayHi("Mike", 50);
        line();
        sayHi("Alice", 25);
        line();
        sayHi("Tom", 30);
        line();
        sayHi("Angela", 50);
        line();
    }
    public static void sayHi(String name, int age){
        System.out.println("Hello " + name + ",you are " + age + " years old");
    }
    public static void line(){
        System.out.println("============================");
    }
}
