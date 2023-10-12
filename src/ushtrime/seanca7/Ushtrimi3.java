package ushtrime.seanca7;

public class Ushtrimi3 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = new int[array1.length-1];


        for (int i = 0; i < 2; i++) {
            array2[i] = array1[i];
        }
        for( int i=2; i<array2.length;i++){
            array2[i]=array1[i+1];
        }


        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");

        }
    }
}
