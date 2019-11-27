package Arrays.Sorting;

/**
 * Shell sort is an advance concept of insertion and bubble sort. here we do comparisions based on gaps instead of next element.
 * We created a sequence of gaps and do comparision in both left and right.
 */
public class ShellSort {
    public static void main(String[] arg) {
        int arr[] = { 23, 29, 15, 19, 31, 7, 9, 5, 2, -5, -10};
        ShellSort obj = new ShellSort();
        obj.shellSort(arr);
        obj.printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void shellSort(int[] arr) {
        int length = arr.length;
        int gap;
        int i = 0;
        int j;
        int k;

        for (gap = length/2; gap >= 1; gap = gap/2) {
            j  = gap;
            i = 0;
            k = 0;
            while (j < length) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                k = i - gap;
                if (k >= 0) {
                    if (arr[k] > arr[i]) {
                        int temp = arr[k];
                        arr[k] = arr[i];
                        arr[i] = temp;
                    }
                }
                i++;
                j++;
            }
        }
    }
}
