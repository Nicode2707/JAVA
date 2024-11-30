import java.util.ArrayList;

public class swap {

    public static void swaped(ArrayList<Integer> list,int idx1 ,int idx2){
        int temp = list.get(idx1);
        list.set(temp,idx2);
        list.set(idx2 , temp);
    }
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(155);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);

    System.out.println("Before swapping two number");
    System.out.println(list);
    
    int idx1 =1 ,idx2 = 2;
   swaped(list, idx1, idx2);
    System.out.println("After swapping two number");
    System.out.println(list);
   } 
}
