package objektetSeanca11b.romakeNeArab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni nje numer Romak:");
        String nr = input.next();
        System.out.println(ktheNrRomakNeArab(nr));

    }

    public static int ktheNrRomakNeArab(String numri) {
        Map<Character, Integer> numratRomake = new HashMap<>();
        numratRomake.put('I', 1);
        numratRomake.put('V', 5);
        numratRomake.put('X', 10);
        numratRomake.put('L', 50);
        numratRomake.put('C', 100);
        numratRomake.put('D', 500);
        numratRomake.put('M', 1000);

        int rezultati = numratRomake.get(numri.charAt(numri.length() - 1));

        for (int i = numri.length() - 2; i >= 0; i--) {
            if (numratRomake.get(numri.charAt(i)) < numratRomake.get(numri.charAt(i + 1))) {
                rezultati -= numratRomake.get(numri.charAt(i));
            } else {
                rezultati += numratRomake.get(numri.charAt(i));
            }
        }
        return rezultati;
    }
}
