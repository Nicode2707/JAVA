import java.util.*;
public class loop4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        sc.close();

        do{
            System.out.println("enter the number to print");
            int n =Sc.nextInt();
            if(10 % n == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        }
    }
