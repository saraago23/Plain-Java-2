package ushtrime.seanca5;

public class Ushtrimi5b {
    public static void main(String[] args) {
        //for

        /*for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //while

        int i=0, j=0;

        while(i<6){
            j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
