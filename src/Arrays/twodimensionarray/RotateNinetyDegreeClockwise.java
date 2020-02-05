package Arrays.twodimensionarray;

public class RotateNinetyDegreeClockwise {
    static int N = 3;
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] twodimen = new int[row][col];
        fillElements(row, col, twodimen);
        System.out.println();

        TransposeArray(twodimen, row, col);
        System.out.println();
        //swapArrayElements(twodimen, row, col);
        swapArrayElementsAsRowWise(twodimen, row, col);

    }

    private static void swapArrayElementsAsRowWise(int[][] twodimen, int row, int col) {
        for(int j = 0; j < N; j++) {
            for (int i = 0; i < N/2; i++) {
                int temp = twodimen[i][j];
                twodimen[i][j] = twodimen[N-1-i][j];
                twodimen[N-1-i][j] = temp;
            }
        }
        System.out.println("Anticlockwise rotation");
        printMatrix(twodimen, row, col);
    }

    private static void printMatrix(int[][] twodimen, int row, int col) {
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(twodimen[i][j] + " ");
            }
        }
    }

    private static void swapArrayElements(int[][] twodimen, int row, int col) {
           for (int i = 0; i < N; i++) {
               for (int j = 0; j < N/2; j++) {
                   int temp = twodimen[i][j];
                   twodimen[i][j] = twodimen[i][N-1-i];
                   twodimen[i][N-1-i] = temp;
               }
           }
           printMatrix(twodimen, row, col);
    }

    // In transpose array we will convert row to column
    private static void TransposeArray(int[][] twodimen, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = twodimen[i][j];
                twodimen[i][j] =  twodimen[j][i];
                twodimen[j][i] = temp;
            }
        }
        printMatrix(twodimen, row, col);

    }



    private static void fillElements(int row, int col, int[][] twodimen) {
        int k = 1;
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                twodimen[i][j] = k;
                System.out.print(twodimen[i][j] + " ");
                k++;
            }
        }
    }
}