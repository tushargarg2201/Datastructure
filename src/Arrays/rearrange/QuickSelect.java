package Arrays.rearrange;

public class QuickSelect {
    public static void main(String [] args) {
        int [] array = new int[] { 8, 9, 15, 12, 13, 5, 7, 6, 1 };
        int kthPosition = 3;

        int result = findkthElement(array,0, array.length - 1, kthPosition);
        System.out.println("Final result is --->" + result);

    }

    private static int findkthElement(int[] array, int left, int right, int kthPosition) {

        int pivotIndex = findPivotElementIndex(array, left, right);
        System.out.println("PivotIndex is --->" + pivotIndex);

        if (kthPosition -1 == pivotIndex) {
            System.out.println("Array is-->");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            return array[pivotIndex];
        } else if(kthPosition -1  < pivotIndex) {
            return findkthElement(array, 0, pivotIndex - 1, kthPosition);
        } else {
            return findkthElement(array, pivotIndex + 1, array.length - 1, kthPosition);
        }
    }

    private static int findPivotElementIndex(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivotElement = array[left];
        i = i + 1;

        while (i < j) {
            while (array[i] < pivotElement) {
                i++;
            }

            while (array[j] > pivotElement) {
                j--;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        int temp = pivotElement;
        array[left] = array[j];
        array[j] = temp;

        return j;
    }
}
