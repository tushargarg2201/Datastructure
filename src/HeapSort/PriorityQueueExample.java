package HeapSort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(2);

        System.out.println(priorityQueue.poll());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>( new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(1);

        System.out.println("first top element in maxPriorityQueue is -->" + maxHeap.poll());
        System.out.println("second top element in maxPriorityQueue is -->" + maxHeap.poll());
        System.out.println("third top element in maxPriorityQueue is -->" + maxHeap.poll());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(5, 2);
        hashMap.put(4, 3);
        hashMap.put(2, 6);
        hashMap.put(1, 1);
        hashMap.put(3, 2);

        PriorityQueue<HashMap<Integer, Integer>> minPriorityQueue = new PriorityQueue<>();
        minPriorityQueue.add(hashMap);
        HashMap<Integer, Integer> tempMap = minPriorityQueue.poll();
        while (!tempMap.keySet().isEmpty()) {
            System.out.println("key is ---> "+ tempMap.keySet());
            System.out.println("value is ---> "+ tempMap.values());
        }
    }
}
