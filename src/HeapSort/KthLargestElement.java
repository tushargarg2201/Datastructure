package HeapSort;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int [] a = { 2, 3, 4, 5, 1, 6, 7, 8};
        int k = 4;
        int result = largestElement(a, k);
        System.out.println("result is --->" + result);
    }

    private static int largestElement(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : a) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.remove();
    }
}
