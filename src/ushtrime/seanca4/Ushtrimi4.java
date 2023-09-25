package ushtrime.seanca4;

import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int parametri;
        System.out.println("Vendosni nje parameter(numer): ");
        if(input.hasNextInt()){
            parametri = input.nextInt();

            System.out.println(eshteMeMadh10(parametri));
        }else{
            System.out.println("Ju nuk keni vendosur nje numer");
        }
    }
    public static boolean eshteMeMadh10( int parametri){
        if(parametri<10){
            return true;
        } else{
            return false;
        }
    }
}
