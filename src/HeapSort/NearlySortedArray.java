package HeapSort;

import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void main(String[] args) {
        //int[] a = {6, 5, 3, 2, 8, 10, 9};
        int[] a = { 10, 9, 8, 7, 4, 70, 60, 50};
        int k = 4;

        int [] result = nearlySorted(a, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] nearlySorted(int[] a, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int index = 0;
        for (int i : a) {
            priorityQueue.add(i);
            if (priorityQueue.size() > k) {
                a[index] = priorityQueue.remove();
                index++;
            }
        }
        while (!priorityQueue.isEmpty()) {
            a[index] = priorityQueue.remove();
            index++;
        }
        return a;
    }
}
