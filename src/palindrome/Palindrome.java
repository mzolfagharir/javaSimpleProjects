package palindrome;
import java.util.Scanner;
public class Palindrome {
   static void   palindrome(int number){
        int reverse=0;
        int temp = number;
        while (temp>0){
           int remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp / 10;
        }
        if(reverse == number) System.out.println("Is Palindrome");
        else System.out.println("Is Not Palindrome");
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Number");
       int userinput = input.nextInt();
        palindrome(userinput);
    }
}