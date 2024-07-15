public class OOPS{

    public static void main(String[] args) {
        Pen p1 = new Pen();   //created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(4);
        System.out.println(p1.tip);
        Pen p2 = new Pen();
        p2.setcolor("Green");
        System.out.println(p2.color);
        p2.settip(7);
        System.out.println(p2.tip);
    } 
}

class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int newtip){
        tip = newtip;
    }
}
