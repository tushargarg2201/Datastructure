package Arrays.rotation;

/**
 * This is a program of binarySearch where all the elements been sorted. Here we do compare mid with SearchElement.
 */

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int end = arr.length - 1;
        int keyElement = 10;

        binarySearch.startBinarySearchImplwithRecursion(0, end, arr, keyElement);
        binarySearch.startBinarySearchImplWithoutRecursion(0, end, arr, keyElement);
    }

    private void startBinarySearchImplWithoutRecursion(int start, int end, int[] arr, int keyElement) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == keyElement) {
                System.out.println("Found key element without Recursion and it's position--->" + mid);
                return;
            } else if (keyElement > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    private void startBinarySearchImplwithRecursion(int start, int end, int[] arr, int keyElement) {
        if (start > end) {
            System.out.println("No element found");
            return;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == keyElement) {
            System.out.println("Found key element with Recursion and it's position--->"+ mid);
            return;
        } else if (keyElement > arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        startBinarySearchImplwithRecursion(start, end, arr, keyElement);
    }

}
