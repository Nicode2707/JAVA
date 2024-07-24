public class abs {
    
    public static void main(String[] args) {
        horse badal = new horse();
        badal.eat();
        badal.walk();

        chicken kukuru = new chicken();
        kukuru.eat();
        kukuru.walk();
        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();
}

class horse extends Animal{
    void walk (){
        System.out.println("walk in our 4 legs");
    }
}

class chicken extends Animal{
    void walk (){
        System.out.println("walk in our 2 legs");
    }
}
