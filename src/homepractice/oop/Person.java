package homepractice.oop;

public class Person {

    String name;
    int age;
    String telephone;

    Person(String nameFromUser, int ageFromUser) {
        name = nameFromUser;
        age = ageFromUser;
    }
    Person (String nameFromUser, String telephoneFromUser){
        name = nameFromUser;
        telephone = telephoneFromUser;
        }
    Person(){
        name = "Anna";
        age = 28;
    }
    public void displayPerson(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("telephone number is "+telephone);
    }
    }

