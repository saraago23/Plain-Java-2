package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrMinutave;
        int nrViteve;
        int nrDiteve;

        System.out.println("Vendos numrin e minutave");
        if(input.hasNextInt()) {
            nrMinutave = input.nextInt();
            nrViteve = nrMinutave / 525600;
            nrDiteve = (nrMinutave - (nrViteve * 525600)) / 1440;
            System.out.println("Per minutat qe keni vendosur i takojne: " + nrViteve + " vite dhe " + nrDiteve + " dite");
        }
       else{
            System.out.println("Vlera qe ju keni vendosur nuk eshte nje numer");
        }
    }
}
