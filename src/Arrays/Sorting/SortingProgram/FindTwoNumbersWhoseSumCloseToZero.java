package Arrays.Sorting.SortingProgram;

import java.util.Arrays;

public class FindTwoNumbersWhoseSumCloseToZero {
    public static void main (String [] args) {
        FindTwoNumbersWhoseSumCloseToZero obj = new FindTwoNumbersWhoseSumCloseToZero();
        obj.FindTwoNumbersWhoseSumCloseToZeroImpl();
        obj.findSumThroughSortingTechnique();
    }

    private void findSumThroughSortingTechnique() {
        int arr[] = {-10, 15, 20, -25, -70, -80, -20, 30, 100};
        int minSum = 0;
        int minElement1 = 0, minElement2 = 0;
        int i = 0, j = arr.length - 1;

        Arrays.sort(arr);

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (i == 0) {
                minSum = Math.abs(sum);
                minElement1 = arr[i];
                minElement2 = arr[j];
            } else {
                if (Math.abs(sum) <= minSum) {
                    minSum = Math.abs(sum);
                    minElement1 = arr[i];
                    minElement2 = arr[j];
                }
            }

            if (sum < 0) {
                i++;
            } else {
                j --;
            }
        }

        System.out.println("minsum through sorting technique--->" + minSum);
        System.out.println("minElement1 is--->" + minElement1);
        System.out.println("minElement2 is--->" + minElement2);


    }

    //This is a brute force method
    private void FindTwoNumbersWhoseSumCloseToZeroImpl() {
        //int arr[] = {1, 60, -10, 70, -80, 85};
        int arr[] = {-10, 15, 20, -25, -70, -80, -20, 30};
        int minSum = 0;
        int minElement1 = 0, minElement2 = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int localSum = arr[i] + arr[j];

                if (localSum < 0) {
                    localSum = ~localSum;
                }

                if (i == 0) {
                    minSum = localSum;
                    minElement1 = i;
                    minElement2 = j;
                } else {
                    if (localSum <= minSum) {
                        minSum = localSum;
                        minElement1 = arr[i];
                        minElement2 = arr[j];
                    }
                }
            }
        }

        System.out.println("minsum is--->" + minSum);
        System.out.println("minElement1 is--->" + minElement1);
        System.out.println("minElement2 is--->" + minElement2);
    }

}
