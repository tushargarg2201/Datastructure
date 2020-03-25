package Arrays.rearrange;

public class FindLocalMinima {
    public static void main(String [] args) {
        // int [] arr = {9, 6, 3, 14, 15, 7, 4};
        int [] arr = {23, 50, 55, 18, 3};
        int index = localMinimaSolution(arr, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("No solution found--->" + index);
        } else {
            System.out.println("Solution found--->" + index);
        }
    }

    private static int localMinimaSolution(int[] arr, int start, int end) {
        if (start < 0 || end > arr.length - 1) {
            return -1;
        }

        int mid = (start +  end) / 2;
        if (mid == 0 || mid < arr.length -1 && arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
            return mid;
        }

        if (mid > 0 && arr[mid - 1] < arr[mid]) {
            return localMinimaSolution(arr, 0, mid -1);
        }

        if (mid < arr.length - 1 && arr[mid + 1] > arr[mid]) {
            return localMinimaSolution(arr, mid + 1, end);
        }

        return -1;
     }
}
