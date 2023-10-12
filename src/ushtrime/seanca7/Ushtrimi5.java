package ushtrime.seanca7;

import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Me sa elemente doni te krijoni array-n? ");
        int nr = input.nextInt();
        int[] array5 = new int[nr];
        boolean perseritje = false;

        System.out.println("Vendosni vlerat:");
        for (int i = 0; i < array5.length; i++) {
            array5[i] = input.nextInt();
        }
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }

        for (int i = 0; i < array5.length; i++) {
            for (int j = i + 1; j < array5.length; j++) {
                if (array5[i] == array5[j]) {
                    System.out.println("\nNumri: " + array5[i] + " perseritet ");
                    perseritje = true;
                }
            }


        }
        if (!perseritje) {
            System.out.println("\nAsnje numer nuk perseritet");
        }
    }
}
