package ushtrime.seanca5;

import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendos nje numer");
        int numer = input.nextInt();
        int output = 0;

        while (numer != 0) {
            int r = numer % 10;
            output = output * 10 + r;
            numer = numer / 10;


        }
        System.out.println(output);
    }
}

