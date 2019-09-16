package Level_01.Algos;

public class BubleSort {

    public static int[] bubbleSortArray(int[] arr){

        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr;
        }

        for (int value: arr) {
            for (int index = 0; index < arr.length - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }

        return arr;
    }
}
