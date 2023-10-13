package ushtrime.seanca8b;

public class Ushtrimi2 {
    static int[] array = {2, 4, 5, 2,5,8,5};

    public static void main(String[] args) {

        int[] print = findRecurringElements(5, array);
        for (int i = 0; i < print.length; i++) {
            System.out.print(print[i] + " ");
        }
    }

    public static int[] findRecurringElements(int element, int[] array) {
        int perseritje=0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                perseritje++;

            }
        }
        int position=0;
        int[]array2Indexet=new int[perseritje];
        for (int i=0; i<array.length;i++) {
            if (element == array[i]) {
                array2Indexet[position] = i;
                position++;
            }
        }

        return array2Indexet;
    }
}