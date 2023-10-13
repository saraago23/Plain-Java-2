package ushtrime.seanca8b;

public class Ushtrimi6 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 5, 6},
                {6, 7, 2},
                {2, 3, 4},
                {6, 5, 2}};
        gjejNumratMeTeMedhenjTeRrjeshtave(array);
        gjejNumratMeTeMedhenjTeKolonat(array);
    }

    public static void gjejNumratMeTeMedhenjTeRrjeshtave(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;
            System.out.print("\nNumri me i madh per rrjeshtin " + i + " eshte: ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.print(max);
        }
        System.out.println();
    }

    public static void gjejNumratMeTeMedhenjTeKolonat(int[][] array) {

        for (int j = 0; j < array[0].length; j++) {
            int max = Integer.MIN_VALUE;
            System.out.print("\nNumri me i madh per kolonen " + j + " eshte: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.print(max);
        }
        System.out.println();
    }

}
