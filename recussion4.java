public class recussion4 {
       
    public static int printsum(int n) {
        if(n == 1){
            return 1;
        }
        int snm1 = printsum(n-1);
        int sn = n+ snm1;
        return sn;
        
    }
    public static void main(String[] args) {
        System.out.println(printsum(10));
    }
}
