package DynamicProgramming;

public class Factorial {
    public static void main(String[] args) {
        int number = fact(50);
        System.out.print("Factorial number is--->"+ number);
    }

    //with Recursion
//    private static int fact(int number) {
//        if (number <= 0 || number == 1) {
//            return 1;
//        }
//        return number * fact(number - 1);
//    }1

    private static int fact(int number) {
        int [] arr = new int[number + 1];
        arr[0] = 1;

        for (int i = 1; i <= number; i++) {
            arr[i] = i * arr[i-1];
        }
        return arr[number];
    }
}
