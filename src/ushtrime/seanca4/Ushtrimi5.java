package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri;
        System.out.println("Jep nje numer");
        if (input.hasNextInt()) {
            numri = input.nextInt();
            System.out.println("Dyfishi i numrit qe keni dhene eshte: " +dyfishoNumrin(numri));
        } else{
            System.out.println("Ju nuk keni dhene nje numer");
        }
    }
    public static int dyfishoNumrin(int numri){
        return 2*numri;
    }
}
