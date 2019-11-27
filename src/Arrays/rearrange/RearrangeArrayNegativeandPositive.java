package Arrays.rearrange;

/**
 * It will arrange negative numbers on left hand side and positive numbers on right hand side.
 */
public class RearrangeArrayNegativeandPositive {
    public static void main(String[] args) {
        RearrangeArrayNegativeandPositive obj = new RearrangeArrayNegativeandPositive();
        int arr[] = {1, 3, 8, -4, 5, -6, 7, -20, 30, 40, -2};
        obj.rearragnePositiveAndNegativeNumbers(arr);
    }

    private void rearragnePositiveAndNegativeNumbers(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] < 0) {
                i++;
            }
            while (arr[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println("Rearrange array is");
        System.out.println("value of i is--->" + i);
        System.out.println("value of j is--->" + j);
        for (int k= 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
