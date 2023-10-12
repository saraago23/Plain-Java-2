package ushtrime.seanca8a;

public class Ushtrimi4b {

    static int [][] array4b= {{100,0,4},{2,3,1}};
    static int min = Integer.MAX_VALUE;
    static int indexI = 0;
    static int indexJ=0;
    public static void main(String[] args) {

        gjejMinPerArray2D(array4b);

    }

    public static void gjejMinPerArray2D(int[][] array){
        for(int i =0; i< array4b.length;i++){
            for(int j=0;j< array4b[i].length;j++){
                if(array4b[i][j]<min){
                    min=array4b[i][j];
                    indexI=i;
                    indexJ=j;
                }
            }
        }
        System.out.println("Minimumi eshte: " + min + " ne indeksin: " + "[" + indexI + "]" + "[" + indexJ + "]");
    }
}
