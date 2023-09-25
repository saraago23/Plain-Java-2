package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, x;
        String messazhiJoNumer="Vlera qe keni vendosur nuk eshte nje numer";
        System.out.println("Vendosni vlerat e a, b dhe c per te gjetur rrenjen e ekuacionit " +
                " ax + b =c");

        if (input.hasNextDouble()) {
            a = input.nextDouble();

            if (input.hasNextDouble()) {
                b = input.nextDouble();
                if (input.hasNextDouble()) {
                    c = input.nextDouble();
                    x = (c - b) / a;
                    System.out.println("Vlera e panjohur x eshte: " + x);
                } else {
                    System.out.println(messazhiJoNumer);
                }

            } else {
                System.out.println(messazhiJoNumer);
            }
        } else {
            System.out.println(messazhiJoNumer);
        }
    }
}

