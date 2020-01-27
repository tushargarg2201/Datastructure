package Arrays.rearrange;

public class FindMaxSumInContigousSubarray {
    public static void main(String[] args) {
        int [] array = { -2, 3, 2, -1};
        int currentSum = array[0];
        int maxSumSoFar = array[0];

        for (int i = 1;  i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            if (currentSum > maxSumSoFar) {
                maxSumSoFar = currentSum;
            }
        }
        System.out.print("Max Sum is--->" + maxSumSoFar);
    }
}
