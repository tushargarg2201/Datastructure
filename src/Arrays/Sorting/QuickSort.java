package Arrays.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        //int arr[] = {1, 5, 24, 8, 15, 3, 16, 10, 20};
        int arr[] = { 10, 15, 2, 3, 5, 6, 1};
        QuickSort obj = new QuickSort();
        obj.quickSort(arr, 0, arr.length - 1);

        System.out.println("Quicksort arrangement is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void quickSort(int[] arr, int lb, int ub) {
        int pivotIndexPosition;
        if (lb < ub) {
            pivotIndexPosition = partitionLogic(arr, lb, ub);
            quickSort(arr, lb, pivotIndexPosition - 1);
            quickSort(arr, pivotIndexPosition + 1, ub);
        }

    }
    private int partitionLogic(int[] arr, int lb, int ub) {
        int start = lb;
        int end = ub;
        int pivotElement = arr[start];
        System.out.println("Start is " + start);
        System.out.println("end is " + end);
        System.out.println("pivotElement is " + arr[start]);
        while (start < end) {
            while (arr[start] <= pivotElement && start < end) {
                start++;
            }
            while (arr[end] > pivotElement) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }


        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;




        return end;
    }
}
