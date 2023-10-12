package ushtrime.seanca8a;

public class Ushtrimi7 {

    static int[][] array7 = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}};
    static int shuma1 = 0;
    static int shuma2 = 0;

    public static void main(String[] args) {

        System.out.println(ktheShumenDiagonaleve(array7));
    }

    public static boolean ktheShumenDiagonaleve(int[][] array) {
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                if (i == j) {
                    shuma1 += array7[i][j];
                }
                if (i + j == 3) {
                    shuma2 += array7[i][j];
                }
            }
        }
        if (shuma1 == shuma2) {
            return true;
        } else{
            return false;
        }
    }
}
