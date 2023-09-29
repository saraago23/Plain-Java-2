package ushtrime.seanca5;

import java.util.Objects;
import java.util.Scanner;

public class Ushtrimi9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String poOsejo;

        do {
            System.out.println("Jepni dy numra,nje te plote dhe nje me presje: ");

            int nr1 = input.nextInt();
            double nr2 = input.nextDouble();

            System.out.println("Shuma e numrave tuaj " + nr1 + " dhe " + nr2 + " eshte: " + (nr1 + nr2));

            System.out.println("Deshironi te vazhdoni me dhenien e vlerave?");

            poOsejo = input.next();
        } while (poOsejo.equals("po"));

        if (poOsejo.equals("jo")) {
            System.out.println("Falemnderit për inputet tuaja");
        } else {
            System.out.println("Mesazhi jo i qarte");

        }
    }
}
