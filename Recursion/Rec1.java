public class Rec1{
    public static void printnum(int n){
        if(n == 1 ){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printnum( n - 1);
    }
    public static void main(String[] args) {
        printnum(10);
    }
}
