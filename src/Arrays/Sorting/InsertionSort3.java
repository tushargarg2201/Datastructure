package Arrays.Sorting;

public class InsertionSort3 {
    public static void main (String [] args) {
        InsertionSort3 obj = new InsertionSort3();
        obj.insertionSortImpl();
    }

    private void insertionSortImpl() {
        int arr[] = {1, 20, 5, -2, -10, 8, 7, 6, 20, 9};
        int i;
        int j;
        int temp;
        int count = 0;

        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            count = 0;
            for (j = i-1; j >=0 ; j--) {
                if (arr[j] > temp) {
                    arr[j+1] = arr[j];
                    count++;
                }
            }
            if (count > 0) {
                arr[i-count] = temp;
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
