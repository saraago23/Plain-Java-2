package ushtrime.seanca5;

public class Ushtrimi1 {

    public static void main(String[] args) {

        int shumaCift = 0;
        int shumaTek = 0;

        for (int numri = 36; numri < 100; numri++) {
            System.out.println(numri);

            if (numri % 2 == 0) {
                shumaCift += numri;
            } else {
                shumaTek += numri;
            }

        }
        System.out.println("Shuma e numrave cift eshte: " + shumaCift);
        System.out.println("Shuma e numrave tek eshte: " + shumaTek);
    }
}
