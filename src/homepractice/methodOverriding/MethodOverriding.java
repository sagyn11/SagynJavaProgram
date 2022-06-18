package homepractice.methodOverriding;

class Bird extends Animal{
    @Override
    public void setSoundOfAnimal(){
        System.out.println("Bird says: ku-ku");
    }
}
class Tiger extends Animal {
    @Override
    public void setSoundOfAnimal() {
        System.out.println("Tiger says: arrrrr");
    }
}
class Dog extends Animal {
    @Override
    public void setSoundOfAnimal() {
        System.out.println("Dog says: gav-gav");
        super.setSoundOfAnimal();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Bird cc = new Bird();
        cc.setSoundOfAnimal();

        Tiger aa = new Tiger();
        aa.setSoundOfAnimal();

        Dog bb = new Dog();
        bb.setSoundOfAnimal();
    }
}
