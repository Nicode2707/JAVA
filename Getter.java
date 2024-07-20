public class OOPS1{

    public static void main(String[] args) {
        Pen p1 = new Pen();   //created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(4);
        System.out.println(p1.gettip());
        Pen p2 = new Pen();
        p2.setcolor("Green");
        System.out.println(p2.getcolor());
        p2.settip(7);
        System.out.println(p2.gettip());
    } 
}

class Pen{
    String color;
    int tip;

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color = newcolor;
    }

    void settip(int tip){
       this.tip = tip;
    }
}
