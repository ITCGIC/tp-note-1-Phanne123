package tp_note_1;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Program for converting time to seconds:");

        int h, m, s;
        System.out.print("Please input hours: \n");
        h = Integer.parseInt(sc.nextLine());

        System.out.print("Please input minutes: \n");
        m = Integer.parseInt(sc.nextLine());

        System.out.print("Please input seconds: \n");
        s = Integer.parseInt(sc.nextLine());

        int se = (h * 3600) + (m * 60) + s;

        System.out.print("Number of seconds = " + se);
    }
}
