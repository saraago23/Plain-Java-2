package ushtrime.seanca8a;

public class Ushtrimi4 {

    static int[] array4 = {3, 6, 2, 3};
    static int min = Integer.MAX_VALUE;
    static int index = 0;

    public static void main(String[] args) {
       gjejMinimumin(array4);

    }

    public static void gjejMinimumin(int[] array){
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < min) {
                min = array4[i];
                index=i;

            }

        }
        System.out.println("Minimumi eshte: " + min + " ne indeksin: " + index);
    }
}
