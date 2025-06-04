public class Rec5{
   
    public static int printfibo(int n) {
       if(n == 0 || n == 1){
        return n;
       }
       int fib = printfibo( n - 1);
       int fibed = printfibo(n -2);
       int fibonacci = fibed +fib;
       return fibonacci;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(printfibo(n));
    }
}