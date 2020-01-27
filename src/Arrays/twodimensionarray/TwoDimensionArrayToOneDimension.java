package Arrays.twodimensionarray;

public class TwoDimensionArrayToOneDimension {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int [] [] twodimen = new int[row][col];
        fillElements(row, col, twodimen);
        System.out.println();
        convertTwoDimensToOneDimens(row, col, twodimen);
    }

    private static void convertTwoDimensToOneDimens(int row, int col, int[][] twodimen) {
        int k = 0;
        int [] onedimen = new int[row * col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                onedimen[k] = twodimen[i][j];
                k++;
            }
        }

        for (int i : onedimen) {
            System.out.print(onedimen[i] + " ");
        }
    }

    private static void fillElements(int row, int col, int[][] twodimen) {
        int k = 0;
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
