package Level_01.Algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SearchNumber_017 {
    public static int singleNumber(int[] A) {
        HashMap<Integer, Integer> storage = new HashMap<>();
        HashSet<Integer> lastElement = new HashSet<>();

        for (int index = 0; index < A.length; index++) {
            Integer element = A[index];
            if (storage.containsKey(element)) {
                storage.put(element, storage.get(element) + 1);
                lastElement.remove(element);
            } else {
                storage.put(element, 1);
                lastElement.add(element);
            }
        }

        List<Integer> last = new ArrayList<>(lastElement);

        return last.get(0);
    }
}
