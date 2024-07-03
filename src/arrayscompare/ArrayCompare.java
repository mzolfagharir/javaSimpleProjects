package arrayscompare;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayCompare {
    static void compare(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter First Array Length");
        int firstarraylength = input.nextInt();
        int[] firstarray = new int[firstarraylength];
        System.out.println("Please Enter First Array Elements" + "Array Length:" +" " + firstarraylength);
        for(int i=0; i<=firstarraylength-1; i++){
            firstarray[i]=input.nextInt();
        }
        System.out.println("Please Enter Second Array Length");
        int secondarraylength = input.nextInt();
        int[] secondarray = new int[secondarraylength];
        System.out.println("Please Enter Second Array Elements" + "Array Length:" +" " + secondarraylength);

        for(int j=0; j<=secondarraylength-1; j++){
            secondarray[j]=input.nextInt();
        }
        Arrays.sort(firstarray);
        Arrays.sort(secondarray);
        System.out.println(Arrays.toString(firstarray));
        System.out.println(Arrays.toString(secondarray));
        int result = Arrays.compare(firstarray,secondarray);
        System.out.println(result);

    }

    public static void main(String[] args) {
        compare();
    }
}