package Arrays.Sorting;

public class QuickSortMedianElementPivot {
    public  static  void main(String[] args) {
        int arr[] = { 10, 15, 2, 3, 5, 6, 1};
        QuickSortMedianElementPivot obj = new QuickSortMedianElementPivot();
        obj.quicksort(arr, 0, arr.length - 1);

        System.out.println("Quicksort arrangement with respective to MedianElement pivot");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    void quicksort(int[] arr, int start, int end) {
        int pivotIndex;
        if (start < end) {
            pivotIndex = medianOfQuickSort(arr, start, end);
            quicksort(arr, 0, pivotIndex - 1);
            quicksort(arr, pivotIndex +1, end);
        }
    }

    private int medianOfQuickSort(int[] arr, int start, int end) {
        int lb = start;
        int ub = end;

        int center = (start + end) / 2;

        if (arr[lb] > arr[center]) {
            int temp  = arr[lb];
            arr[lb] = arr[center];
            arr[center] = temp;
        }

        if (arr[lb] > arr[ub]) {
            int temp  = arr[lb];
            arr[lb] = arr[ub];
            arr[ub] = temp;
        }

        if (arr[center] > arr[ub]) {
            int temp  = arr[center];
            arr[center] = arr[ub];
            arr[ub] = temp;
        }

        int temp = arr[center];
        arr[center] = arr[ub];
        arr[ub] = temp;

        return partition(arr, start, end);
    }

    private int partition(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        int pivotElement = arr[end];

        while (i < j) {
            while (arr[i] < pivotElement) {
                i++;
            }

            while (arr[j] >= pivotElement && i < j) {
                j--;
            }

            if ( i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if (j <= i) {
            int temp = pivotElement;
            arr[end] = arr[j];
            arr[j] = temp;
        }

        System.out.println("value of pivotPosit-->" + j);
        return j;
    }

}
