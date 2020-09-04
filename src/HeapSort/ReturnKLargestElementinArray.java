package HeapSort;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ReturnKLargestElementinArray {
    public static void main(String[] args) {
        int [] a = { 2, 3, 4, 5, 1, 6, 7, 8};
        int k = 3;
        List<Integer> result = kLargestElements(a, k);
        System.out.println("result is --->" + result);
    }

    private static List<Integer> kLargestElements(int[] a, int k) {
        List<Integer> resultList = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : a) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            resultList.add(pq.remove());
        }
        return resultList;
    }
}
