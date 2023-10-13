package ushtrime.seanca8b;

public class Ushtrimi3 {

    public static void main(String[] args) {
        int[] array = {5, 1, 2, 1, 9};
        boolean rritese = false;

        int[] rezultati = rendit(array, rritese);

        for (int i = 0; i < rezultati.length; i++) {
            System.out.print(rezultati[i] + " ");
        }

    }

    public static int[] rendit(int[] a, boolean flag) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (flag) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                } else {
                    if (a[i] < a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }
}
