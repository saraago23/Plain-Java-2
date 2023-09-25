package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rreze;

        System.out.println("Jepni vleren e rrezes per te cilen " +
                "doni te llogarisni siperfaqen: ");

        if (input.hasNextInt()) {
            rreze = input.nextInt();
            System.out.println("Siperfaqja per rrezen qe vendoset eshte: " + llogaritSiperfaqen(rreze));
        } else {
            System.out.println("Vlera qe keni venodsur nuk eshte nje numer");
        }

    }

    public static double llogaritSiperfaqen(int rreze){
        return Math.PI * rreze * rreze;
    }
}
