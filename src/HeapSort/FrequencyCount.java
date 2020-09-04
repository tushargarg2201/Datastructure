package HeapSort;

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int [] a = {1,1,1,3,3,3,3,2,2,4,4,4};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(entry);
        }

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.remove().getKey() + " ");
        }
    }
}
