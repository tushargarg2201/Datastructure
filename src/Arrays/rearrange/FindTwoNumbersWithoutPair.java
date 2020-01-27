package Arrays.rearrange;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class FindTwoNumbersWithoutPair {
    public static void main(String[] args) {
       // int [] array = { 5, 23, 23, 66, 5, 23, 7, 0};
        int[] array = {8, 5, 23, 23, 66, 5, 23, 7, 8 };
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(23);
        list.add(23);
        list.add(66);
        list.add(5);
        list.add(23);
        list.add(7);
        list.add(8);


        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, 1);
            } else {
                int value = hashMap.get(key);
                value++;
                hashMap.put(key, value);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == 1 && count < 2 ) {
                count++;
                System.out.println(entry.getKey());
            }
        }
    }
}
