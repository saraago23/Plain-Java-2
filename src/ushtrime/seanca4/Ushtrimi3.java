package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p1;
        String p2;

        System.out.println("Vendosni dy parametra:");
        p1= input.nextLine();
        p2= input.nextLine();

        System.out.println("Rezultati i krahasimit te parametrave eshte: " + areEqual(p1,p2));
    }

    public static boolean areEqual(String p1, String p2){
        return p1.equals(p2);
    }
}
