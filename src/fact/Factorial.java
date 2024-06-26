import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Number:");
        Scanner input = new Scanner(System.in);
        long f1 = input.nextLong();
        long f2 = 1l;
        if(f1>1) {
            for (long i = 1l; i <= f1; i++) {
                 f2*=i;
            }
            System.out.printf("The Factorial For Your Input Is : %d",f2);
        }
        else System.out.println("No Valid Input!!!");
    }
}
