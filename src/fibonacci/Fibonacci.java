package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Number:");
        int number = input.nextInt();
        int initial = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                initial += i;
            }
            System.out.println("The Fibonacci Series For Your Input Is:" + " " + initial);
        }
        else System.out.println("No Valid input");
    }
}