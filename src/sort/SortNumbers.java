package sort;
import java.util.Scanner;
import java.util.Arrays;
public class SortNumbers {
    static void sortnumbers(){
        System.out.println("Hi, Please Enter the Array Length");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] arraylist = new int[number];
        System.out.println("Please Enter The Numbers");
        for(int i =0; i<=number-1; i++){
            int num = input.nextInt();
            arraylist[i] =num ;
        }
        Arrays.sort(arraylist);
        System.out.println(Arrays.toString(arraylist));
    }
    public static void main(String[] args) {
        sortnumbers();
    }
}