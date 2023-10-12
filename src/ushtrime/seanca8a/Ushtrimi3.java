package ushtrime.seanca8a;

import java.util.Scanner;

public class Ushtrimi3 {
    static int[] array3 = {7, 9, 3, 4};
    static int nrMeTeMedhenj = 0;

    public static void main(String[] args) {
        jepSaNumraMeTeMedhenj(array3);

    }

    public static void jepSaNumraMeTeMedhenj(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jep nje numer:");
        int nrPerdoruesi = input.nextInt();

        for (int i = 0; i < array3.length; i++) {
            if (nrPerdoruesi < array3[i]) {
                nrMeTeMedhenj++;
            }
        }
        System.out.println(nrMeTeMedhenj);
    }
}
