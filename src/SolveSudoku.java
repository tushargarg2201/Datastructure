/**
 *
 */
public class SolveSudoku {

    public static void main(String [] args) {
        int[] [] board = new int[][]
                {
                        {5, 3, 0, 0, 7, 0, 0, 0, 0},
                        {6, 0, 0, 1, 9, 5, 0, 0, 0},
                        {0, 9, 8, 0, 0, 0, 0, 6, 0},
                        {8, 0, 0, 0, 6, 0, 0, 0, 3},
                        {4, 0, 0, 8, 0, 3, 0, 0, 1},
                        {7, 0, 0, 0, 2, 0, 0, 0, 6},
                        {0, 6, 0, 0, 0, 0, 2, 8, 0},
                        {0, 0, 0, 4, 1, 9, 0, 0, 5},
                        {0, 0, 0, 0, 8, 0, 0, 7, 9},

                };

        int n = board.length;

        if (solvePuzzle(board, n)) {
            print(board, n);
        } else {
            System.out.println("Solution not found");
        }
    }


    private static void print(int[][] board, int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(board[r][c]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % (int) Math.sqrt(n) == 0) {
                System.out.print("");
            }
        }
    }


    private static boolean solvePuzzle(int[][] board, int length) {
        int row = -1;
        int col = -1;

        boolean isEmpty = true;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;

                    isEmpty = false;
                    break;
                }
            }

            if (!isEmpty) {
                break;
            }
        }

        if (isEmpty) {
            return true;
        }

        for (int num = 1; num <= length; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;
                if (solvePuzzle(board, length)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }

            }
        }
        return  false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return  false;
            }
        }

        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart; d < boxColStart + sqrt; d++) {
                if (board[r][d] == num) {
                    return  false;
                }
            }
        }
        return  true;
    }

}
