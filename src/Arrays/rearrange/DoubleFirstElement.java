package Arrays.rearrange;

/**
 * https://www.geeksforgeeks.org/double-first-element-move-zero-end/
 *
 * Double the first element and move zero to end
 * Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number.
 * Convert the array in such a way that if next number is a valid number and same as current number,
 * double its value and replace the next number with 0. After the modification,
 * rearrange the array such that all 0’s are shifted to the end.
 *
 * Examples:
 *
 * Input : arr[] = {2, 2, 0, 4, 0, 8}
 * Output : 4 4 8 0 0 0
 *
 * Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
 * Output :  4 2 12 8 0 0 0 0 0 0
 */
public class DoubleFirstElement {
    public static void main(String[] args) {
        DoubleFirstElement obj = new DoubleFirstElement();
        int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        obj.doubleFirstElementImpl(arr);
    }

    private void doubleFirstElementImpl(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = 2 * arr[i];
                arr[i + 1] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
