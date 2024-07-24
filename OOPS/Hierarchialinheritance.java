public class Hierarchial {
    public static void main(String[] args) {
        dog dobby = new dog();
        dobby.eat();
        dobby.bread();
    }

}
class Animal {
    string color;

    void eat(){
        System.out.println("eats");
    }

    void breadthe(){
        System.out.println("breadthe");
    }
}

class Mammal extends Animal{
    void bark(){
        System.out.println("barks");
    }
}
class dog extends Mammal{
    void bread(){
        System.out.println("white");
    }
}
