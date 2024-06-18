package p01;
import java.util.Scanner;
public class Main {
    static  void m(double a, String b, double c){
        double result;
        switch (b){
            case "+":
                 result = a + c;
                System.out.println("a + c =" + " "  + result);
                break;
            case "-":
                 result = a - c;
                System.out.println("a - c =" + " "  + result);
                break;
            case "*":
                 result = a * c;
                System.out.println("a * c =" + " "  + result);
                break;
            case "/":
                 result = a / c;
                System.out.println("First / Second =" + " "  + result);
                break;
            default:
                System.out.printf("The %s is not a valid operation, Fuck You.", b);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Scanner inputString = new Scanner(System.in);
        System.out.println("Please Enter Your First Number:");
        double first = input.nextDouble();
        System.out.println("Please Enter Your Operation");
        String opp = inputString.nextLine();
        System.out.println("Please Enter Your Second Number:");
        double second = input.nextDouble();
        m(first, opp, second);
    }
}
