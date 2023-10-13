package ushtrime.seanca8b;

public class Ushtrimi5 {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 3, 2, 3, 4, 3};
        int uniqueValuesLength = returnLengthOfUniqueValues(array);
        int[] uniqueValues = returnUniqueValues(array, uniqueValuesLength);
        int[][] result = new int[uniqueValuesLength][2];
        for (int i = 0; i < uniqueValues.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (uniqueValues[i] == array[j]) {
                    counter++;
                }
            }
            result[i][0] = uniqueValues[i];
            result[i][1] = counter;
            System.out.println(result[i][0] + " " + result[i][1]);
        }

    }

    public static int returnLengthOfUniqueValues(int[] arr) {
        int uniqueCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCounter++;
            }

        }
        return uniqueCounter;
    }

    public static int[] returnUniqueValues(int[] arr, int uniqueValuesLength) {

        int[] rezult = new int[uniqueValuesLength];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                rezult[position] = arr[i];
                position++;
            }

        }
        return rezult;
    }
}
