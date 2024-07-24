public class derivedinheri {
    public static void main(String[] args) {
        dog dobby = new dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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
    int legs;
}
class dog extends Mammal{
    string bread;
}
