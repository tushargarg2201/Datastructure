package Arrays.rearrange;

public class FindNumberWithEvenDigits {
    public static void main(String [] args) {
        //int [] nums = {555, 901, 482, 1771};
        int [] nums =  {12, 345, 2, 6, 7896};
        int resultCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            count = 0;
            if (digit < 0) {
                digit = ~digit;
            }
            while (digit > 0) {
                digit = digit / 10;
                count++;
            }
            if (count % 2 == 0) {
                resultCount++;
            }
        }
        System.out.println("Result Count is--->" + resultCount);
    }
}
