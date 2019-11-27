package Arrays.rearrange;

/**
 * https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/


Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.

        Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
        Output: 1

        Explanation:
        To bring elements 2, 1, 3 together, swap
        element '5' with '3' such that final array
        will be-
        arr[] = {2, 1, 3, 6, 5}

        Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
        Output: 2
 */

public class MinimumSwaps {
    public static void main (String[] s) {
        MinimumSwaps obj = new MinimumSwaps();
        int k = 5;
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        obj.minimumNumberOfSwaps(arr, k);
    }

    private void minimumNumberOfSwaps(int [] arr, int element) {
        int i = 0;
        int j = arr.length - 1;
        int swapCount = 0;

        while (i < j) {
            while (arr[i] < element) {
                i++;
            }

            while (arr[j] > element) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                swapCount++;
            }

            System.out.println("Swappping count --->" + swapCount);
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}
