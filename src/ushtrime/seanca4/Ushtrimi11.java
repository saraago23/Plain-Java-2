package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        String mesazhiJoNumer="Vlera qe keni vendosur nuk eshte numer";
        System.out.println("Vendosni vlerat e a, b dhe c per ekuacionin ax^2 + bx + c = 0");

        if (input.hasNextInt()) {
            a = input.nextInt();
            if (input.hasNextInt()) {
                b = input.nextInt();
                if (input.hasNextInt()) {
                    c = input.nextInt();
                    d = b * b - (4 * a * c);

                    if (d < 0) {
                        System.out.println("Ekuacioni nuk ka zgjidhje");
                    } else {
                        double x1 = (-b + Math.sqrt(d)) / 2 * a;
                        double x2 = (-b - Math.sqrt(d)) / 2 * a;
                        System.out.println("Per vlerat e dhena rrenjet e ekuacionit jane: " + x1 + " dhe " + x2);
                    }
                } else {
                    System.out.println(mesazhiJoNumer);
                }
            } else {
                System.out.println(mesazhiJoNumer);
            }
        } else {
            System.out.println(mesazhiJoNumer);
        }
    }
}
