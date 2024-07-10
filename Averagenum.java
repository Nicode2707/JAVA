import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int number1 = Scanner.nextInt();

        int number2 = Scanner.nextInt();

        int number3 = Scanner.nextInt();
        
       int average=number1+number2+number3/3;

       System.out.println(average);

       Scanner.close();
    }
}
