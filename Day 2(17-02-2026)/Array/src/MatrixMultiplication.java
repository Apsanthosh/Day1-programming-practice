public class MatrixMultiplication {

    public static int[][] multiply(int[][] A, int[][] B) {

        int m = A.length;        // rows of A
        int n = A[0].length;     // cols of A
        int p = B[0].length;     // cols of B

        // ✅ Compatibility Check
        if (n != B.length) {
            throw new IllegalArgumentException(
                    "Matrix multiplication not possible: Columns of A must equal rows of B."
            );
        }

        // Result matrix m x p
        int[][] C = new int[m][p];

        // Matrix Multiplication
        for (int i = 0; i < m; i++) {          // rows of A
            for (int j = 0; j < p; j++) {      // cols of B
                for (int k = 0; k < n; k++) {  // common dimension
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    // Utility to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };  // 2 x 3

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };  // 3 x 2

        int[][] C = multiply(A, B);

        System.out.println("Result Matrix:");
        printMatrix(C);
    }
}
