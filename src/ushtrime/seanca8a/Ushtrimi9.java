package ushtrime.seanca8a;

public class Ushtrimi9 {

    static int[][] kompaniaGlina={
            {2000,600,750,980,1000,800,900,400,600,500,1000,500},
            {1500,780,600,900,1000,600,800,2100,400,600,500,700},
            {1200,400,500,600,650,320,480,987,457,654,200,390},
            {300,400,500,987,431,564,1287,369,753,452,321,541},
            {300,780,600,900,500,600,800,2100,400,600,500,700}};
    public static void main(String[] args) {
        System.out.println(ktheShumenTotaleTeShitjeve(kompaniaGlina));
    }

    public static int ktheShumenTotaleTeShitjeve(int[][]array){
        int shuma=0;
        for (int i=0;i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                shuma+=array[i][j];
            }
        }
        return shuma;
    }
}
