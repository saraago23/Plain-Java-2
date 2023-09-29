package ushtrime.seanca5;

import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Vendosni n: ");
        int n =input.nextInt();
        double shumaSerise = 1.0;

        for (int i = 4; i <= n; i*= 2) {
            shumaSerise += ((double) 1 / i);
        }
        System.out.println("Shuma e serise eshte: " + (shumaSerise));
    }


}

