package Arrays.rearrange;

import java.util.LinkedHashMap;

public class FindSum {
    public static void main(String[] args) {
        int[] array = {3, 3};
        int sum = 6;
        int[] result = new int[2];
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            int key = sum - array[i];
            if (linkedHashMap.containsKey(key)) {
                result[0] = linkedHashMap.get(key);
                result[1] = i;
            }
            linkedHashMap.put(array[i], i);
        }
        System.out.println(result[0] + " " + result[1]);

    }
}
