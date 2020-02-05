package Arrays.rearrange;

import java.util.ArrayList;
import java.util.List;

public class MaximumNonNegativeSubArray {
    public static void main(String [] args) {
        int [] Array = {-1, -1, -1, -1, -1};

        int startIndex = -1;
        int endIndex = -1;
        int maxStartIndex = -1;
        int maxEndIndex = -1;

        long currentSum = 0;
        long maxSum = -1;

        for (int i = 0; i < Array.length; i++) {
            int value = Array[i];
            if (value >= 0) {
                currentSum = currentSum + value;
                if (startIndex == -1) {
                    startIndex = i;
                }
                endIndex = i;
            } else {
                currentSum = 0;
                startIndex = -1;
                endIndex = -1;
            }

            if (currentSum > maxSum || (maxSum == currentSum && (startIndex - endIndex > maxEndIndex - maxStartIndex))) {
                maxSum = currentSum;
                maxStartIndex = startIndex;
                maxEndIndex = endIndex;
            }
        }

        List<Integer> resultList = new ArrayList<>();

        for (int j = maxStartIndex; j <= maxEndIndex; j++) {
            resultList.add(Array[j]);
        }
        System.out.println("ResultList is--->" + resultList);


    }
}
