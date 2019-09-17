package Level_01.Arrays;

public class MissingNumber_01_020 {
    public static int findMissingNumber(int[] arr) {

        int diff = 0;
        int index = 1;

        while (index <= 10) {
            diff += index;
            index++;
        }

        for (int value: arr) {
            diff -= value;
        }

        return diff;
    }
}
