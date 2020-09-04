package HeapSort;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int [] a = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4,  5, 6};
        int k = 3;
        List<Integer> resultList = TopKFrequentElementsImp(a, k);
        System.out.print(resultList);
    }

    private static List<Integer> TopKFrequentElementsImp(int[] a, int k) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int currentKey = a[i];
            if (hashMap.containsKey(currentKey)) {
                int currentValue = hashMap.get(currentKey);
                currentValue++;
                hashMap.put(currentKey, currentValue);
            } else {
                hashMap.put(currentKey, 1);
            }
         }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            priorityQueue.add(entry);
            if (priorityQueue.size() > k) {
                priorityQueue.remove();
            }
        }
        while (!priorityQueue.isEmpty()) {
            resultList.add(priorityQueue.remove().getKey());
        }
        return resultList;
    }
}
