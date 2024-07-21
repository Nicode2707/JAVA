public class inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}

//base class
class Animal {
    string color;

    void eat(){
        System.out.println("eats");
    }

    void breadthe(){
        System.out.println("breadthe");
    }
}

//derived class
class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swin in water");
    }
}
