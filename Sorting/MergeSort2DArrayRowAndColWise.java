package Sorting;

public class MergeSort2DArrayRowAndColWise {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 2, 9 },
                { 1, 7, 3 },
                { 4, 8, 6 }
        };

        // Sort rows
        for (int i = 0; i < matrix.length; i++) {
            mergeSort(matrix[i], 0, matrix[i].length - 1);
        }

        // Transpose the matrix (swap rows with columns)
        int[][] transposedMatrix = transpose(matrix);

        // Sort columns
        for (int i = 0; i < transposedMatrix.length; i++) {
            mergeSort(transposedMatrix[i], 0, transposedMatrix[i].length - 1);
        }

        // Transpose back to get the final sorted matrix
        int[][] sortedMatrix = transpose(transposedMatrix);

        // Print the sorted matrix
        for (int[] row : sortedMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[j] > arr[i]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
// [1, 3, 7]
// [2, 5, 8]
// [4, 6, 9]