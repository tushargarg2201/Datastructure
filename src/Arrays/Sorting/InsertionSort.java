package Arrays.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 5, 4, 33, 12};
        InsertionSort obj = new InsertionSort();
        obj.rightShiftLogic(arr);
    }

    private void rightShiftLogic(int [] arr) {
        int temp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i -1;
            while (j >= 0 && arr[j] > temp) {
                arr[j +1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        System.out.println("Increased order array");

        for (int k = 0; k < arr.length; k++)  {
            System.out.print(arr[k] + " ");
        }
    }

}
