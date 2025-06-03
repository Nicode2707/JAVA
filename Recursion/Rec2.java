public class Rec2 {
    public static void printnum(int n){
            if(n == 1 ){
            System.out.println(n);
            return ;
        }
        printnum( n - 1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        printnum(15);
    }
}
