package ushtrime.seanca8a;

public class Ushtrimi8 {

    static int[][] notatStudenteve = {
            {4, 5, 6, 8, 10},
            {5, 6, 4, 9, 9},
            {8, 6, 5, 8, 9},
            {4, 6, 9, 10, 8},
            {5, 4, 7, 8, 9},
            {8, 6, 5, 8, 9},
            {5, 6, 4, 9, 9},
            {4, 5, 6, 8, 10},
            {5, 6, 8, 9, 10},
            {10, 8, 7, 6, 5}
    };


    public static void main(String[] args) {
        printoNotat(notatStudenteve);
        int[] mesataret = rruajMesataren(notatStudenteve);
        System.out.println("\n"+ "Mesatarja me e larte eshte: " + ktheMesatarenMeTeLarte(mesataret));
    }

    public static void printoNotat(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Notat e studentit " + (i + 1) + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

    }

    public static int[] rruajMesataren(int[][] array) {
        int[] mesataret = new int[10];
        for (int i = 0; i < array.length; i++) {
            int shumaNotave = 0;
            for (int j = 0; j < array[0].length; j++) {
                shumaNotave += array[i][j];
            }
            mesataret[i] = shumaNotave / array[i].length;
            System.out.println("Mesatarja per studentin " + (i + 1) + ": " + mesataret[i] + " ");
        }
        return mesataret;
    }

    public static int ktheMesatarenMeTeLarte(int[] mesataret) {
        int max = mesataret[0];
        for (int i = 0; i < mesataret.length; i++) {
            if (max < mesataret[i]) {
                max = mesataret[i];
            }
        }
        return max;
    }
}
