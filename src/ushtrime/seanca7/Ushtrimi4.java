package ushtrime.seanca7;

public class Ushtrimi4 {
  static int[] array3 = {1, 4, 9, 10};

    public static void main(String[] args) {

        ktheArrayn(array3);

    }

    public static void ktheArrayn(int[] array3){
        for (int i = 0; i < 3; i++) {
            array3[i] = array3[i + 1];

        }

      for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
