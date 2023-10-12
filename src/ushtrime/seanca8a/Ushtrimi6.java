package ushtrime.seanca8a;

public class Ushtrimi6 {

   static int shuma=0;
    static int [][] array6 = {{2,3,4},
            {5,7,6,9}};
    public static void main(String[] args) {

        System.out.println(ktheShumenKolonave(array6));
    }

    public static int ktheShumenKolonave(int[][] array){
        for(int i=0; i<array6.length;i++){
            for (int j=0;j< array6[i].length;j++){
                shuma+=array6[i][j];
            }
        }
        return shuma;
    }
}
