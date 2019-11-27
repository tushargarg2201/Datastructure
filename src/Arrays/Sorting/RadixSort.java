package Arrays.Sorting;

public class RadixSort {
    static int  arr[] = { 432, 8, 530, 90, 88, 231, 11, 45, 677, 199, 1999};

    static int length = arr.length;

    public static void main(String[] arg) {

        RadixSort obj = new RadixSort();
        radixSortImpl();
    }

    private static void radixSortImpl() {
        int maxNumber = findMaxNumber(arr, length);

        for (int pos = 1; (maxNumber / pos) > 0; pos = pos * 10) {
            countSortImpl(arr, pos, length);
        }

        System.out.println("---Sorting through Radix sort is----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int findMaxNumber(int[] arr, int length) {
        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }


    private static void countSortImpl(int [] arr, int pos, int length) {
        int count[] = new int [10];
        int [] outputArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int divider = arr[i] / pos;
            int remainder = divider % 10;
            ++count[remainder];
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i-1] + count[i];
        }

        for (int i = length - 1; i >= 0; i--) {
            int divider = arr[i] / pos;
            int remainder = divider % 10;
            int countArrayValue = count[remainder];
            count[remainder] = countArrayValue - 1;
            outputArray[countArrayValue - 1] = arr[i];

           //outputArray[--count[ (arr[i]/pos)%10 ]] = arr[i];
        }

        for (int i = 0; i < outputArray.length; i++) {
            arr[i] = outputArray[i];
        }
    }
}
