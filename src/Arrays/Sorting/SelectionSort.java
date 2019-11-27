package Arrays.Sorting;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] numbers={53,344,13,233,2};
        int minNum=0;

    for(int j=0;j<=numbers.length-2;j++)
    {
        int minIndex=j;
        minNum = numbers[j];

        for (int i = j + 1; i < numbers.length; i++) {
                if (minNum > numbers[i]) {
                    minNum = numbers[i];
                    minIndex = i;
                }
            }
            int temp;
            temp = numbers[j];
            numbers[j] = minNum;
            numbers[minIndex] = temp;


    }
        for (int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
    }

}
