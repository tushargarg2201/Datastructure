package Arrays.Sorting;

public class SelectionSort2 {
    public static void main(String[] args) {
        SelectionSort2 obj = new SelectionSort2();
        obj.selectionSortImpl();
    }

    private void selectionSortImpl() {
        int arr[] = { 10, 15, 2, 3, 5, 6, 1};

        int minElement;
        int minIndex;

        for (int i = 0; i < arr.length; i++) {
            minElement = arr[i];
            minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (minElement > arr[j]) {
                    minElement = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
