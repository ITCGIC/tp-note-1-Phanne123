package tp_note_1;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        System.out.println(" program for converting seconds into H:M:S");


        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int sec = in.nextInt();
        int s = sec % 60;
        int h = sec / 60;
        int m = h % 60;
        h = h / 60;

        System.out.print("Time corresponding to 1259seconds is: \n");
        System.out.print(h + ":" + m + ":" + s);
        System.out.print("\n");
        System.out.print("\n");


    }
}