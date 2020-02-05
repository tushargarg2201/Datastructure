package Arrays.rearrange;

import java.util.*;

public class FindMissingAndDuplicateNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(3);

        int missingNumber = 0;
        int duplicateNumber = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i : A) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else if (hashMap.containsKey(i)) {
                int value = hashMap.get(i);
                value++;
                hashMap.put(i, value);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 0) {
                System.out.println("missing number is --->" + value);
            } else if (value > 1) {
                System.out.println("duplicate Number is--->" + key);
            }
        }

        for (int i = 1; i <= A.size(); i++) {
            if (hashMap.get(i) == null) {
                System.out.println("Missing number  is--->" + i);
            }
        }
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        System.out.println("resultList is --->" + resultList);
    }
}
