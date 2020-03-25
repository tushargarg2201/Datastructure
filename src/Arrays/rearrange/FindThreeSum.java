package Arrays.rearrange;

import java.util.ArrayList;
import java.util.Arrays;

public class FindThreeSum {
    public static void main(String[] arr) {
        int [] array = { -1, 2, 1, -4 };
        int sum = 2;
        Arrays.sort(array);
        ArrayList<Integer> resultList = new ArrayList();
        for (int i = 0; i < array.length - 2; i++) {
            int low = i + 1;
            int high = array.length - 1;
            while (low < high) {
                if (array[i] + array[low] + array[high] == sum) {
                    resultList.add(array[i]);
                    resultList.add(array[low]);
                    resultList.add(array[high]);
                    break;
                } else if (array[i] + array[low] + array[high] < sum) {
                    low++;
                } else if (array[i] + array[low] + array[high] > sum) {
                    high--;
                }
            }
        }

        for (int k = 0; k < resultList.size(); k++) {
            System.out.print(resultList.get(k) + " ");
        }
    }
}
