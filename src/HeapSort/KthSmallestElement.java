package HeapSort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int [] a = { 2, 3, 4, 5, 1, 6, 7, 8};
        int k = 3;
        int result = smallestElement(a, k);
        System.out.println("result is --->" + result);
    }

    private static int smallestElement(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : a) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.remove();
    }

}
