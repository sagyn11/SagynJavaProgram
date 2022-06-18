package homepractice.oop;

public class PersonTester {
    public static void main(String[] args) {

        System.out.println("=====no arguments construction=======");
        Person a = new Person();
        a.displayPerson();
        System.out.println("========name and age==========");
        a = new Person("Sagyn",24);
        a.displayPerson();
        System.out.println("========name and telephone=========");
        a = new Person("Chirag", "996554321987");
        a.displayPerson();
    }
}
