package ushtrime.seanca8b;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        krijoArray1D();
        krijoArray2D();
    }

    public static int[] krijoArray1D() {

        Scanner input = new Scanner(System.in);
        System.out.println("Jep nr e elementeve per arrayn");
        int nr = input.nextInt();
        int[] array1 = new int[nr];
        System.out.println("Vendos elementet:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        return array1;
    }

    public static void krijoArray2D() {
        Scanner input= new Scanner(System.in);
        System.out.println("Vendosni madhesine e arrayt");
        int nr=input.nextInt();
        int[][]array2=new int[nr][];
        for(int i=0;i<nr;i++){
            System.out.println("Sa elemente do te kesh brenda arrayt?");
            int nrEl=input.nextInt();
            int[] arrayIri=new int [nrEl];
            System.out.println("Vendos elementet");
            for (int j=0; j<nrEl;j++){
                arrayIri[j]=input.nextInt();
            }
            array2[i]=arrayIri;
        }
        for (int i =0; i<array2.length;i++){
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        }




    }
}