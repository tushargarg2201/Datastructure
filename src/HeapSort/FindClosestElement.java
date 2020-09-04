package HeapSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindClosestElement {
    public static void main(String[] args) {
        int [] a = { 5, 6, 7, 8, 9, 8};
        int k = 3;
        int x = 7;

        List<Integer> result = findClosestElement(a, k, x);
        System.out.print(result);
    }

    private static List<Integer> findClosestElement(int[] a, int k, int x) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                return b.key - a.key;
            }
        });

        for (int i : a) {
            Pair pair = new Pair();
            pair.key = Math.abs(x - i);
            pair.value = i;
            priorityQueue.add(pair);

            if (priorityQueue.size() > k) {
                priorityQueue.remove();
            }
        }

        List<Integer> resultList = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            Pair pair = priorityQueue.remove();
            resultList.add(pair.value);
        }
        return resultList;
    }

    static class Pair {
        int key;
        int value;
    }
}
