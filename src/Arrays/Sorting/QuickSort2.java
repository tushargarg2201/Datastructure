package Arrays.Sorting;

public class QuickSort2 {
    public  static  void main(String[] args) {
        int arr[] = { 1, 15, 2, 3, 5, 6, 10};
        QuickSort2 obj = new QuickSort2();
        obj.quicksort(arr, 0, arr.length - 1);

        System.out.println("Quicksort arrangement is");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    private void quicksort(int[] arr, int start, int end) {
        int pivotIndex;
        if (start < end) {
            pivotIndex = quicksortPartition(arr, start, end);
            quicksort(arr, 0, pivotIndex - 1);
            quicksort(arr, pivotIndex +1, end);
        }
    }

    private int quicksortPartition(int[] arr, int start, int end) {
        int pivotElement = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (arr[i] <= pivotElement && i < j) {
                i++;
            }

            while (arr[j] > pivotElement) {
                j--;
            }

            if ( i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = pivotElement;
        arr[start] = arr[j];
        arr[j] = temp;


        System.out.println("value of pivotPosit-->" + j);
        return j;
    }


}
