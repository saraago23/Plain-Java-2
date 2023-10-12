package ushtrime.seanca8a;

public class Ushtrimi5 {

    static int[][] array5 = {
            {1, 2},
            {3, 4},
            {5,6}};
    static int[][] arrayNdihmes = new int[2][3];

    public static void main(String[] args) {

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                arrayNdihmes[j][i]=array5[i][j];
            }
        }
        printoArrayn(arrayNdihmes);
    }


    public static void printoArrayn(int[][] array){
        for(int i=0;i<array.length;i++){
            for (int j =0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
