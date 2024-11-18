import java.util.Scanner;

public class goodday {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("enter your name");
        String name = Scanner.nextLine();

        System.out.print("hello"   + name +   "have a good day");

        Scanner.close();
    }
}
