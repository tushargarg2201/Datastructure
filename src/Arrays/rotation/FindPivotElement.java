package Arrays.rotation;

/**
 * This program is about finding the pivotElement in the rotated sorted array.
 * 1. First we find out the pivot element
 * 2. After finding the pivot element we can determine whether we need to search in which part of an array.
 * 3. This program takes OLog(n) take time to find pivot element and OLog(n) time to find Binary search.
 */
public class FindPivotElement {
    public static void main(String[] args) {
        FindPivotElement obj = new FindPivotElement();
        int arr[] = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int end = arr.length - 1;
        int start = 0;
        int pivotIndex = obj.findPivotElementImplementation(0, end, arr);
        int pivotElement = arr[pivotIndex];
        int searchElement = 5;
        if (pivotElement > 0) {
            System.out.println("Final pivot element is---" + pivotElement);
            if (searchElement >= pivotElement && searchElement <= arr[end]) {
                start = pivotIndex;
            } else {
                end = pivotIndex - 1;
            }
        }

        obj.binarySearchImpl(start, end, pivotIndex, arr, searchElement);
    }

    private int findPivotElementImplementation(int start, int end, int[] arr) {
        int pivotIndex = -1;
        int pivotElement = -1;
        if (start > end) {
            System.out.println("There is no pivot element found");
            return pivotIndex;
        }

        int mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1]) {
            pivotIndex = mid + 1;
            System.out.println("Pivot index is --->" + pivotIndex);
            return pivotIndex;
        }
        else if (arr[start] > arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        pivotIndex = findPivotElementImplementation(start, end, arr);
        return pivotIndex;
    }

    private void binarySearchImpl(int start, int end, int pivotIndex, int[] arr, int keyElement) {
        while (start <= end) {
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

}
