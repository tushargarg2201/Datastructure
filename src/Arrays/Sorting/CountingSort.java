package Arrays.Sorting;

/**
 * Counting sort works if number are repeated and we can calculate the ranges. It's solves the problem with o(range + length) time
 * to sort the array.
 */
public class CountingSort {
    public static void main(String[] arg) {
        int arr[] = { 2, 1, 1, 0, 5, 3, 2, 1, 5, 7, 9, 0, 4};
        CountingSort obj = new CountingSort();
        obj.countingSortImp(arr, 9);
    }

    private void countingSortImp(int [] arr, int range) {
        int length = arr.length;
        int[] freqArray = new int[range+1];
        int[] originalArray = new int[length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            int value = freqArray[index];
            value++;
            freqArray[index] = value;
        }

        for (int i = 0; i < freqArray.length; i++) {
            int count = freqArray[i];
            while (count > 0) {
                originalArray[j] = i;
                j++;
                count--;
            }
        }
        System.out.println("Counting sort arrangement is--->");

        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
    }
}
