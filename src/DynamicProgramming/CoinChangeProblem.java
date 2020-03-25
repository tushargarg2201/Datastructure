package DynamicProgramming;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3};
        int n = 4;
        int len = arr.length;
        coinSolution(arr, n, len);
    }

    private static void coinSolution(int[] arr, int amount, int coins) {
        int[] [] table = new int[amount + 1][coins + 1];
        for (int i = 0; i < coins; i++) {
            table[0][i] = 1;
        }
        for (int i = 1; i <= coins; i++) {
            for (int j = 1; j <= amount; j++) {
                if (i > j) {
                    table[i][j] = table[i-1][j];
                } else {
                    table[i][j] = table[i-1][j] + table[i][j-i];
                }
            }
        }
        System.out.print("table is --->"+ table[amount][coins]);
    }
}
