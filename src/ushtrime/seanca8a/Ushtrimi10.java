package ushtrime.seanca8a;

public class Ushtrimi10 {

    static int[] array10 = {4, 7, 1, 3, 0};

    public static void main(String[] args) {
        sortArray(array10);
    }

    public static void sortArray(int[] array) {

        for(int i =0;i<array.length;i++){
            for (int j=i+1;j< array.length;j++){
                int min=0;
                if(array[i]>array[j]){
                    min=array[i];
                    array[i]=array[j];
                    array[j]=min;
                }
            }
        }
        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
