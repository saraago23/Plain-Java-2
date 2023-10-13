package ushtrime.seanca8b;

public class Ushtrimi4 {
    public static void main(String[] args) {
        int[] array = {1, 6, 9, 3, 8};
        //%2 mbetja=0--cift, %2 mbetja=1--tek
        System.out.println("Numri tek me i madh eshte: " + gjejNrMeTeMadh(array,1));
        System.out.println("Numri cift me i madh eshte: " + gjejNrMeTeMadh(array,0));
    }

    public static int gjejNrMeTeMadh(int[] array, int mbetja) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == mbetja && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
