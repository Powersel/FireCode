package Level_01.Strings;

/*

Find the first non-duplicate character in a string. Return null if no unique character is found.

firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
firstNonRepeatedCharacter( "cbcd" ) --> 'b'
firstNonRepeatedCharacter( "cdcd" ) --> null

 */

import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueChar_01_005 {
    public static Character firstNonRepeatedCharacter(String str) {
        if (str.length() == 0 || str == null) {
            return null;
        }

        if (str.length() == 1) {
            return str.charAt(0);
        }

        HashMap<Character, Integer> storage = new HashMap<>();
        HashSet<Character> uniqueSrorage = new HashSet<>();

        int index = 1;

        for (Character value: str.toCharArray()) {
            if (uniqueSrorage.contains(value)) {
                storage.remove(value);
            } else {
                uniqueSrorage.add(value);
                storage.put(value, index);
                index++;
            }
        }

        if (uniqueSrorage.size() > 0) {
             Character test = findMinValue(storage);
             return test;
        }

        return null;
    }

    static private Character findMinValue(HashMap<Character, Integer> storage) {

        Character tmp = null;
        int minIndex = Integer.MAX_VALUE;

        for (Character key: storage.keySet()) {
            int value = storage.get(key);
            if (value < minIndex) {
                minIndex = value;
                tmp = key;
            }
        }


        return tmp;
    }
}
