package ushtrime.seanca5;

import java.util.Scanner;

public class Ushtrimi10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendos dy numra: ");
        int numri1 = input.nextInt();
        int numri2 = input.nextInt();

        System.out.println("Numri: " + numri1 + " i ngritur ne fuqi te "
                + numri2 + " eshte: " + llogaritNumrinNeFuqi(numri1, numri2));
    }

    public static int llogaritNumrinNeFuqi(int numri1, int numri2) {
        int rezultati = 1;
        for (int i = 1; i <= numri2; i++) {
            rezultati *= numri1;

        }
        return rezultati;
    }
}
