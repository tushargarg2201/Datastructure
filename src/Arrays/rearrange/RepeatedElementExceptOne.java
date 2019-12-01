package Arrays.rearrange;

public class RepeatedElementExceptOne {
    public static void main(String[] args) {
        int [] array = { 1, 1, 2, 2, 3, 4, 4, 5, 5};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];


        }
        System.out.print("Result is " + result);
    }

}
