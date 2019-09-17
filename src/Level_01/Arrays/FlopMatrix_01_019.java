package Level_01.Arrays;

public class FlopMatrix_01_019 {
    public static void flipItVerticalAxis(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            flipArray(arr);
        }
    }

    private static void flipArray(int[] arr) {
        for (int index = 0; index < arr.length / 2; index++) {
            int tmp = arr[index];
            int lastIndex = arr.length - index - 1;
            arr[index] = arr[lastIndex];
            arr[lastIndex] = tmp;
        }
    }
}
