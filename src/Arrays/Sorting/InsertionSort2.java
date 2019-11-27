package Arrays.Sorting;

/**
 * Selection Sort is basically similar to insertion sort. Here we have to fill the smallest element in the first postion,
 * 2nd smallest it on second position and so on.
 */
public class InsertionSort2 {
    public static void main (String [] args) {
        InsertionSort2 obj = new InsertionSort2();
        obj.insertionSortImpl();
    }

    private void insertionSortImpl() {
        int arr[] = {1, 20, 5, 2, 10, 8, 7, 6};
        int minIndex;
        int minElement;
        boolean isSwapRequired = false;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            minElement = arr[i];
            isSwapRequired = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (minElement > arr[j]) {
                    minElement = arr[j];
                    minIndex = j;
                    isSwapRequired = true;
                }
            }
            if (isSwapRequired) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println("Insertion sort ascending order");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
