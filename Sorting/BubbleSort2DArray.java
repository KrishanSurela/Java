package Sorting;

// sorting 2d array row wise and column wise.
public class BubbleSort2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 2, 9 },
                { 1, 7, 3 },
                { 4, 8, 6 }
        };

        sort2DArray(matrix);

        // Print the sorted matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void sort2DArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < cols; l++) {
                        if (matrix[i][j] < matrix[k][l]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
    }
}
//123
//456
//789
