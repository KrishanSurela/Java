public class Rotate2DArray {
    public static void rotateClockwise(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Create a new matrix to store the rotated elements
        int[][] rotatedMatrix = new int[m][n];

        // Rotate each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedMatrix[j][(i + 1) % m] = matrix[i][j];
            }
        }

        // Copy the rotated matrix back to the original matrix
        for (int i = 0; i < m; i++) {
            System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, n);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateClockwise(matrix);

        // Display the rotated matrix
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
