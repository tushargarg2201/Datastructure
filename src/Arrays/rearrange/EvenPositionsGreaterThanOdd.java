package Arrays.rearrange;


/**
 * Program No 10.
 *
 * Rearrange array such that even position are greater than odd
 *
 * input int A[] = { 1, 3, 2, 2, 5 };
 * output 1 5 2 3 2
 */
public class EvenPositionsGreaterThanOdd {
    public static void main (String[] s) {
        EvenPositionsGreaterThanOdd obj = new EvenPositionsGreaterThanOdd();
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        obj.rearrangeArray(arr);
        obj.printArray(arr);
    }

    private void printArray(int[] arr) {
        System.out.println("Print array is");
        for (int i = 0;  i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void rearrangeArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i%2 == 0 && arr[i + 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            } else if (i % 2 == 1 && arr[i] > arr[i + 1]) {
                int temp1 = arr[i];
                arr[i] = arr[i +1];
                arr[i+1] = temp1;
            }
        }

    }

}
