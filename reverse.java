import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int n=270703;
        while(n>0){
            int lastdigit = n%10;
                System.out.println(lastdigit + "");
            n=n/10;

        }
    }
}

