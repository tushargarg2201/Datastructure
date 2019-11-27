package Arrays.Sorting.SortingProgram;

import java.util.Arrays;

/* Given an array of integers, print the array in such a way that the first element is first maximum and second element is first minimum and so on.

        Examples :

        Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
        Output : 7 1 6 2 5 3 4

        Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
        Output : 9 1 8 2 7 3 6 4
 */

public class AlternateSorting {
    public static void main (String [] args) {
        AlternateSorting obj = new AlternateSorting();
        obj.alternateSortingImpl();
    }

    private void alternateSortingImpl() {
        int [] arr =  {7, 1, 2, 3, 4, 5, 6};
        int tempArray [] = new int[arr.length];
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int k = 0;

        while (i < j) {
            tempArray[k++] = arr[j--];
            tempArray[k++] = arr[i++];
        }

        if (arr.length % 2 == 1) {
            tempArray[k] = arr[i];
        }

        for (int m = 0; m < tempArray.length; m++ ) {
            System.out.print(tempArray[m] + " ");
        }
    }
}
