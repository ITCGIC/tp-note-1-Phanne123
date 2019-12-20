package tp_note_1;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Program for calculating cost of a call.\n");

        int h, m, s,h1,m1,s1;
        System.out.print("Please input start hours:");
        h = Integer.parseInt(sc.nextLine());

        System.out.print("Please input start minutes:");
        m= Integer.parseInt(sc.nextLine());

        System.out.print("Please input start seconds:");
        s= Integer.parseInt(sc.nextLine());

        System.out.print("Please input end hours:");
        h1= Integer.parseInt(sc.nextLine());

        System.out.print("Please input end minutes:");
        m1= Integer.parseInt(sc.nextLine());

        System.out.print("Please input end seconds:");
        s1=Integer.parseInt(sc.nextLine());

        int sec1= (h*3600)+(m*60)+s;
        int sec2= (h1*3600)+(m1*60)+s1;
        double total = (double)(sec2-sec1)/60;
        int h2 = (int)total;
        int m2 = h2 % 60;
        int s2 = (int)(total*60)%60;
        h2 = h2 / 60;
        double cost = (total*0.05);
        System.out.println("Total of duration is: "+h2+":h"+m2+":mns"+s2+":s" );
        System.out.print("Total cost of this call is: "+cost+"$");

    }

}
