public class MinesweeperGenerator {

    public static char[][] generateBoard(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        // 8 directions (row and column changes)
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'E') {

                    int mineCount = 0;

                    // Check all 8 neighbors
                    for (int d = 0; d < 8; d++) {

                        int newRow = i + dx[d];
                        int newCol = j + dy[d];

                        // ✅ Boundary check (VERY IMPORTANT)
                        if (newRow >= 0 && newRow < m &&
                                newCol >= 0 && newCol < n &&
                                board[newRow][newCol] == 'M') {

                            mineCount++;
                        }
                    }

                    // Replace 'E' with count
                    board[i][j] = (char)(mineCount + '0');
                }
            }
        }

        return board;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'E','E','E'},
                {'E','M','E'},
                {'E','E','E'}
        };

        char[][] result = generateBoard(board);
        printBoard(result);
    }
}
