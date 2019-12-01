package Arrays.rearrange;

public class FindTwoMissingNumbers {
    public static void main(String[] args) {
        int numberOfElements = 10;
        int [] array = { 1, 9, 8, 7, 6, 3, 10 };
        Boolean[] booleanArray = new Boolean[numberOfElements + 1];

        for (int i = 1; i < booleanArray.length; i++) {
            booleanArray[i] = false;
        }

        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (!booleanArray[val]) {
                booleanArray[val] = true;
            }
        }

        for (int i = 1; i < booleanArray.length; i++) {
            if (booleanArray[i] == false) {
                System.out.println("Missing number " + i);
            }
        }
    }
}
