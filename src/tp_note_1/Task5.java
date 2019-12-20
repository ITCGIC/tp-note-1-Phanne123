package tp_note_1;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Convertion rate is : 1USD = 4000");
        int r;
        System.out.println("Please input money in Riels:");
        r= Integer.parseInt(sc.nextLine());
        double ex =(double)r/4000;

        System.out.println("Exchange money is" +ex+"USD");


    }
}

