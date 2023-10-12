package ushtrime.seanca7;


import java.util.Arrays;
import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni gjatesine e array-eve qe do te krijoni");
        int nr = input.nextInt();
        int[] array1 = new int[nr];
        boolean teBarabarte = false;
        System.out.println("Vendosni elementet:");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        System.out.println("Vendosni elementet e array tjeter");
        int[] array2 = new int[nr];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < array2.length; j++) {
            System.out.print( array2[j] + " ");
        }

        for (int i =0; i< array1.length;i++){
        if (array1[i] == array2[i]) {
            System.out.println("\nArrayt jane te barabarte");
            teBarabarte = true;

        }

    }

        if (!teBarabarte) {
        System.out.println("\nArrayt nuk jane te barabarte");
    }
    }
}
