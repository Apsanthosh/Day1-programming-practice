public class GameOfLife {

    public static void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        // Step 1: Compute transitions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int liveNeighbors = 0;

                // Count live neighbors (original state)
                for (int d = 0; d < 8; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];

                    if (ni >= 0 && ni < m && nj >= 0 && nj < n &&
                            Math.abs(board[ni][nj]) == 1) { // originally alive
                        liveNeighbors++;
                    }
                }

                // Apply rules
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1; // Alive → Dead
                }

                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2;  // Dead → Alive
                }
            }
        }

        // Step 2: Finalize the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == -1) board[i][j] = 0;
                if (board[i][j] == 2)  board[i][j] = 1;
            }
        }
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
                {0,1,0},
                {0,1,0},
                {0,1,0}
        };

        gameOfLife(board);
        printBoard(board);
    }
}
