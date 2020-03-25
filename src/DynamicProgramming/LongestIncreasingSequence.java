package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        int [] arr = { 4, 3, 9, 7, 6, 8, 20 };
        int result[] = new int[arr.length];

        Arrays.fill(result, 1);

        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    int possibleAns = result[j] + 1;
                    if (possibleAns > result[i]) {
                        result[i] = possibleAns;
                    }
                }
            }
        }
        int maxLength = 0;
        for (int k = 1; k < result.length; k++) {
            if (maxLength < result[k]) {
                maxLength = result[k];
            }
        }
        System.out.print("MaxLength is --->" + maxLength);
    }
}
