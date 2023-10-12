package ushtrime.seanca8a;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ushtrimi1dhe2 {
    static int[] array = {1, 3, 7, 5};
    static int max = array[0];

    public static void main(String[] args) {

        // System.out.println(gjejMax2(3,4));

        for (int i = 1; i < array.length; i++) {
            max = gjejMax(max, array[i]);
        }
        System.out.println(max);
    }


    public static int gjejMax(int nr1, int nr2) {
        return nr1 > nr2 ? nr1 : nr2;
    }
}
