package Arrays.rearrange;

import java.util.concurrent.atomic.DoubleAccumulator;

public class MoveZeroAtEndWithoutChangingOrder {
    public static void main(String[] args) {
        //int [] A = { 0,1,0,3,12 };
        int [] A = { 0, 0, 1};
        int len = A.length;
        int k = 0;
        for (int i = 0; i < len; i++) {
            k = 0;
            if (A[i] == 0) {
                int temp = A[i];
                k = i + 1;
                while (k < len) {
                    A[k-1] = A[k];
                    k++;
                }
                A[len - 1] = temp;
            }
        }

        for (int j = 0; j < len; j++) {
            System.out.print(A[j] +  " ");
        }
    }
}
