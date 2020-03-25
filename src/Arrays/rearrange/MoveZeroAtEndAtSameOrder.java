package Arrays.rearrange;

public class MoveZeroAtEndAtSameOrder {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < len) {
            nums[j] = 0;
            j++;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] +  " ");
        }
    }
}
