package ushtrime.seanca7;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni madhesine e array-t tuaj: ");
        int nr = input.nextInt();
        int [] arr1 = new int[nr];
        System.out.println("Vendoni elementet: ");
        int shuma=0;

        for( int i =0; i<nr;i++){
            arr1[i]= input.nextInt();
            shuma+=arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");

        }

        System.out.println("\nMesatarja eshte: " + shuma/arr1.length);
    }
}
