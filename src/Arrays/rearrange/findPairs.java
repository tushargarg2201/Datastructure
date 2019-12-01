package Arrays.rearrange;

import java.util.HashMap;
import java.util.HashSet;

public class findPairs {
    public static void main(String[] args) {
            int [] array = { 4, 5, 1, 8, 0, 2, 3};
            int sum = 9;
            HashSet<Integer> hashSet = new HashSet<>();

            for (int i = 0; i < array.length; i++) {
                hashSet.add(array[i]);
            }
            for (int i = 0; i < array.length; i++) {
                int targetVal = sum-array[i];
                if (hashSet.contains(targetVal)) {
                    System.out.println("Pair with given sum " + sum + " is (" + array[i] + ", " + targetVal + ")");
                }
            }
    }
}
