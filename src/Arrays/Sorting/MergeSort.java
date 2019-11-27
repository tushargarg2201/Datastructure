package Arrays.Sorting;

/**
 * Merge sort works on divide and conquer algorithim. It works on 2 principal.
 * 1. Divide the list or array till it's size doesn't become 1.
 * 2. Once the subarray has a size 1 then start merging with adjacent sublist.
 * 3. Continue this process till that array is not merged completely.
 * 4. average and worst case time complexity of this algo is O(nLogn)
 */
public class MergeSort {

    public static void main (String [] args) {
        MergeSort obj = new MergeSort();
        int arr[] =  { 15, 5, 24, 8, 1, 3, 16, 10, 20};
        int start = 0;
        int end = arr.length - 1;
        obj.mergeSort(arr, start, end);
    }

    private void mergeSort(int arr[], int start, int end) {
        int mid;
        if (start < end) {
            mid = (start + end) /2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            doMerge(arr, start, mid, end);
        }
    }

    private void doMerge(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid + 1;
        int k = 0;
        int [] temp = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= end) {
            temp[k++] = arr[j++];
        }

        System.out.println("final array is" );


        // copy the data in the actual array. This is the important part.
        int z = 0;
        for (int m = start; m <= end; m++) {
            arr[m] = temp[z++];
            System.out.print(arr[m] + " ");

        }
    }
}
