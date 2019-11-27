package Arrays.rearrange;


import java.sql.Array;
import java.util.Arrays;

/**
 * Program no 11, https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/
 * Given an array of integers, task is to print the array in the order – smallest number, Largest number, 2nd smallest number, 2nd largest number, 3rd smallest number, 3rd largest number and so on…..
 * Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
 * Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}
 *
 * Logic :
 * 1. Sort an array
 * 2. We can do with one extra array with same size.
 * 3. We can also do within the same array to just shift an array.
 *
 */
public class SmallestToLargestAlternative {
    int startIndex = 1;
    int lastElement = -1;
    static int count = 0;
    public static void main(String[] args) {
        SmallestToLargestAlternative obj = new SmallestToLargestAlternative();
        int[] arr = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            count++;
            obj.shiftArrayToRightWithRange(arr);
        }

        System.out.println("SmallestToLargestAlternative and count is --->" + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private void shiftArrayToRightWithRange(int[] arr) {
        lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= startIndex; i--) { // right shift logic
            arr[i] = arr[i - 1];
            count++;
        }
        if (startIndex < arr.length - 1) {
            arr[startIndex] = lastElement;
            startIndex = startIndex + 2;
        }
    }



}
