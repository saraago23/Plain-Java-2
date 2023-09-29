package ushtrime.seanca5;

import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni numrin e seances per te " +
                "pare temën që do të trajtohet në atë seancë");
        String seanca = input.nextLine();

        switch (seanca) {
            case "1":
                System.out.println("Introduction to Java.(Installation etc)");
                break;
            case "2":
                System.out.println("lab (1 ore )\n" +
                        "control statements and loops, switch (2 ore)    ");
                break;
            case "3":
                System.out.println("Pune e pavarur");
                break;
            case "4":
                System.out.println("\n" +
                        "OOP 1 (2 ore)\n" +
                        "Lab (1 ore)");
                break;
            case "5":
                System.out.println("\n" +
                        "Lab (1 ore)\n" +
                        "OOP 2 (2 ore)");
                break;
            default:
                System.out.println("Moduli i parë nuk përmban një temë për seancën që ju kërkuat!");
        }
    }
}
