package ushtrime.seanca5;

import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        //8a

        /*Scanner input = new Scanner(System.in);
        System.out.println("Vendosni emrin tuaj");
        String emri = input.next();
        String emriMbrapsht = "";

        for (int i = emri.length() - 1; i >= 0; i--) {
            emriMbrapsht += emri.charAt(i);
        }
        System.out.println(emriMbrapsht);*/

        //8b Shkruaj një program që verifikon nëse emri i dhënë
        // nga përdoruesi është palindromë apo jo

        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni emrin tuaj");
        String emri = input.next();
        String emriMbrapsht = "";

        for (int i = emri.length() - 1; i >= 0; i--) {
            emriMbrapsht += emri.charAt(i);
        }

        if(emriMbrapsht.equals(emri)){
            System.out.println("Emri juaj eshte nje palindrome");
        } else{
            System.out.println("Emri juaj nuk eshte nje palindrome");
        }

    }
}
