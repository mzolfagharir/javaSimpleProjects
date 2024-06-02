package cardnumber;

import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Card Number");
        String myCard = input.nextLine();
        if(myCard.length()==0){
            System.out.println("You didnt Enter Any Number!!!");
        }
        else {
            String p1= myCard.substring(0,4);
            String p2=myCard.substring(4,12);
            String p3=myCard.substring(12,16);
            p2=p2.replace(p2, "XXXXXXXX");
            String test = p1 + p2 +p3;
            System.out.println(test);


        }
    }
}