package Arrays.Sorting;

public class QuickSortLastElementPivot {
    public  static  void main(String[] args) {
        int arr[] = { 10, 15, 2, 3, 5, 6, 1};
        QuickSortLastElementPivot obj = new QuickSortLastElementPivot();
        obj.quicksort(arr, 0, arr.length - 1);

        System.out.println("Quicksort arrangement with respective to lastElement pivot");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
    void quicksort(int[] arr, int start, int end) {
        int pivotIndex;
        if (start < end) {
            //pivotIndex = quicksortPartition(arr, start, end);
            pivotIndex = quicksortPartition2(arr, start, end);
            quicksort(arr, 0, pivotIndex - 1);
            quicksort(arr, pivotIndex +1, end);
        }
    }

    private int quicksortPartition2(int[] arr, int start, int end) {
        int pivotElement = arr[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivotElement) {
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp = arr[partitionIndex];
        arr[partitionIndex] = arr[end];
        arr[end] = temp;
        System.out.println("value of partitionIndexx-->" + partitionIndex);
        return partitionIndex;
    }


    private int quicksortPartition(int[] arr, int start, int end) {
        int pivotElement = arr[end];
        int i = start;
        int j = end;

        while (i < j) {
            while (arr[i] < pivotElement && i < j) {
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

        int temp = pivotElement;
        arr[end] = arr[j];
        arr[j] = temp;


        System.out.println("value of pivotPosit-->" + j);
        return j;
    }
}
