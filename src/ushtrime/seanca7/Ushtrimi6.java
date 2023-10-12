package ushtrime.seanca7;

import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni gjatesine e arrayt");
        int nr = input.nextInt();
        int[] array6 = new int[nr];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        System.out.println("Vendosni elementet:");

        for (int i = 0; i < array6.length; i++) {
            array6[i] = input.nextInt();
        }

        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > max1) {
                max2=max1;
                max1= array6[i];


            }
        }

        System.out.println("\nNumri me i madh eshte: " + max1 + " dhe numri i dyte me i madh eshte : " + max2);
    }
}
