public class Rec4 {
    
    public static int printsum(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int k = printsum(n - 1);
        int sum = n+k;
        return sum;
        
    }
    public static void main(String[] args) {
        System.out.println(printsum(5));
    }
}
