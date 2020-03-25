package Arrays.rearrange;

public class ReverseNumbersWithPositions {
    static int startIndex = -1;
    public static void main(String [] args) {
        int [] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            startIndex = i % k;
            if (startIndex == 0) {
                reverseArray(arr, i, k + i);
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void reverseArray(int[] arr, int i, int k) {
        int startIndex = i;
        int endIndex = k - 1;
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }


}
