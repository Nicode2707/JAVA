import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int marks[] = new int[100];

        marks[0]=Scanner.nextInt();
        marks[1]=Scanner.nextInt();
        marks[2]=Scanner.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner.close();
    }
}
