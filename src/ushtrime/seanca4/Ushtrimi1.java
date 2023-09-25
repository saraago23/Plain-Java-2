package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gjatesi;
        int gjeresi;

        System.out.println("Vendosni parametrat e drejtkendeshit " +
                "per te cilin doni te llogarisni siperfaqen:");
        if (input.hasNextInt()) {

            gjatesi = input.nextInt();

            if(input.hasNextInt()){
                gjeresi=input.nextInt();
                System.out.println("Perimetri i drejtkendeshit me permasa " + gjatesi + " dhe " + gjeresi + " eshte: "
                        + llogaritPerimetrin(gjatesi, gjeresi));
            } else{
                System.out.println(" Ju nuk keni vendosur numer");
            }

        } else {
            System.out.println("Ju nuk keni vendosur numer");
        }

    }
    public static int llogaritPerimetrin(int gjatesi, int gjeresi) {
        return 2 * gjatesi + 2 * gjeresi;
    }
}
