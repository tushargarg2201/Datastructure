package Arrays.rearrange;

/**
 * Rearrange zeros on right hand side in array.
 */
public class RearragneZeros {
    public static void main (String[] s) {
        RearragneZeros obj = new RearragneZeros();
        int arr[] = {1, 3, 8, 0, 5, 0, 7, 0, 30, 40, 0};
        obj.rearrangeZeros(arr);
    }
    private void rearrangeZeros(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int count = 0;

        while (i < j) {
            while (arr[i] > 0) {
                i++;
                count++;
            }

            while (arr[j] == 0) {
                j--;
                count++;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("rearranging zero at last --->" + count);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
