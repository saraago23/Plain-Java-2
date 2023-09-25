package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mosha;
        int vitiLindjes;
        System.out.println("Vendosni vitin tuaj te lindjes:");
        if (input.hasNextInt()) {
            vitiLindjes = input.nextInt();
            mosha= 2023-vitiLindjes;
            if(mosha<=20){
                System.out.println("Kategoria deri në 20");
            }
            else if(mosha>20 && mosha<=50){
                System.out.println("Kategoria mbi 20 deri në 50!");
            }
           else{
                System.out.println("Kategoria mbi 50!");
            }

        } else{
            System.out.println("Ju nuk keni vendosur nje vit");
        }
    }
}
