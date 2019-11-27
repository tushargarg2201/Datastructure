package Arrays.Sorting.SortingProgram;

public class MergeTwoArrays {
    public static void main (String [] args) {
        MergeTwoArrays obj = new MergeTwoArrays();
        obj.mergeTwoArraysImpl();
    }

    private void mergeTwoArraysImpl() {
        int [] arr1 = { 2, 7, 10};
        int [] arr2 = { 5, 8, 12, 24};

        int finalLength = arr1.length + arr2.length;
        int [] arr3 = new int[finalLength];

        int i , j, k ;
        i = j = k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length ) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length ) {
            arr3[k++] = arr2[j++];
        }

        System.out.println("After merging array is");

        for (int m = 0; m < arr3.length; m++) {
            System.out.print(arr3[m] + " ");
        }
    }
}
