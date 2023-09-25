package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shuma = 0;

        System.out.println("Vendosni 5 numra");
        for (int i = 0; i < 5; i++) {

            if (input.hasNextInt()) {
                int nr = input.nextInt();
                System.out.println(nr);
                shuma += nr;

            }

        }
        System.out.println("Mesatarja per numrat eshte: " + shuma/5);
    }
}