package DynamicProgramming;

public class FibbinaciSeries {
    public static void main(String [] args) {
        int fibiNumber = fibi(10);
        System.out.print("fibi number is--->" + fibiNumber);
    }

    private static int fibi(int number) {
        int [] arr = new int[number + 1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= number; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[number];
    }
}
