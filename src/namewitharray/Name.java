package namewitharray;
import java.util.Scanner;
import java.util.Arrays;
public class Name {
    static void countNames() {
        Scanner inputnum = new Scanner(System.in);
        Scanner inputname = new Scanner(System.in);
        System.out.println("Hi, How many names do you have?");
        int num = inputnum.nextInt();
        String[] names = new String[num];
        System.out.println("Please Enter Names");
        for(int i=0; i<=names.length-1; i++){
            names[i]=inputname.nextLine();
        }
        System.out.println(Arrays.toString(names));
//        Arrays.asList(names).contains("seyyed");
        System.out.println(Arrays.asList(names).contains("seyyed"));
    }

    public static void main(String[] args) {
        countNames();
    }
}
