package ushtrime.seanca7;

import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni madhesine e array-t tuaj: ");
        int nr = input.nextInt();
        int[] arr1 = new int[nr];
        System.out.println("Vendoni elementet: ");
        boolean gjetur=false;


        for (int i = 0; i < nr; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Cilin element doni te kontrolloni?");
        int nr2 = input.nextInt();


        for (int i = 0; i < arr1.length; i++) {
            if (nr2 == arr1[i]) {
                System.out.println("Elementi ndodhet ne array ne pozicionin: " + i);
                gjetur=true;
                break;
            }
        }
        if(!gjetur){
            System.out.println("Elementi nuk u gjend");
        }
    }
}
