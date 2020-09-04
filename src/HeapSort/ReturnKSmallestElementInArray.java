package HeapSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ReturnKSmallestElementInArray {
    public static void main(String[] args) {
        int [] a = { 2, 3, 4, 5, 1, 6, 7, 8};
        int k = 3;
        List<Integer> result = ksmallestElements(a, k);
        System.out.println("result is --->" + result);
    }

    private static List<Integer> ksmallestElements(int[] a, int k) {
        List<Integer> resultList = new ArrayList<>();
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
        while (!pq.isEmpty()) {
            resultList.add(pq.remove());
        }
        return resultList;
    }
}
