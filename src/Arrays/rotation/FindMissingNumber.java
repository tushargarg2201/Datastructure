package Arrays.rotation;

/**
 * Missing number between 1..n where no duplicate elements
 * It's an element missing which start from any number of an array.
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        //int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12};
        int arr[] = {3, 1, 2, 5, 3};
        int count1 = 0;
        int count2 = 0;

        int x1 = 0;
        for (int i = 0; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
            count1++;
        }
        System.out.println("XOR of 1st provided array--" + x1);
        System.out.println("XOR of 1st count1--" + count1);

        int x2 = 0;
        for(int i = arr[0]; i < count1 + 1 + arr[0]; i++) {
            x2 = x2 ^ i;
            count2++;

        }
        System.out.println("XOR of 1st actual array--" + x2);
        System.out.println("XOR of 1st count2--" + count2);

        int x3 = x1 ^ x2;

        System.out.println("Final Missing element--->" + x3);

    }
}
