package ushtrime.seanca5;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shuma = 0;
        System.out.println("Jepni numra: ");
        while (input.hasNextInt()) {

            int numer = input.nextInt();
            System.out.println(numer);

            if (numer > 9 && numer < 100) {
                shuma += numer;

            }

        }
        System.out.println(shuma);
    }
}
