package Level_01.Strings;

public class ReplaceAllSpaces_01_007 {
    public static String replace(String a, String b) {

        if (a == null || a.length() == 0 || a.length() == 1) {
            return a;
        }

        String[] storage = a.split(" ");
        String result = "";

        int length = storage.length;

        for (int index = 0; index < length; index++) {
            if (index == length - 1) {
                result = result + storage[index];
            } else {
                result = result + storage[index] + b;
            }
        }

        return result;
    }
}
