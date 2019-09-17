package Level_01.Algos;


// {2,5,7,8,9},9

public class BinnarySearch_01_018 {
    public static Boolean binarySearch(int[] arr, int n){

        if (arr.length == 0) {
            return false;
        }

        if (arr.length == 1) {
            return arr[0] == n;
        }

        return ifValueExists(arr, n, 0, arr.length);
    }

    private static boolean ifValueExists(int[] arr, int n, int left, int right) {


        int diff = right - left;

        if (diff == 1 && arr[left] != n) {
            return false;
        }

        int index = ((right - left) / 2);
        int currIndex = left + index;
        int current = arr[currIndex];

        if (current == n) {
            return true;
        }

        if (current > n) {
            return ifValueExists(arr, n, left, currIndex);
        } else if (current < n) {
            return ifValueExists(arr, n, currIndex, right);
        }

        return false;
    }
}
