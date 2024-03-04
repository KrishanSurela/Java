public class QuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element (find index of pivot)
        int pivotIndex = partition(arr, si, ei);

        quickSort(arr, si, pivotIndex - 1); // left part from pivot
        quickSort(arr, pivotIndex + 1, ei); // right part from right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for element smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // pivot ko sahi index pe place krna
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printMe(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 23, 45, 54, 34, 56, 23, 56, 12, 31 };
        quickSort(arr, 0, arr.length - 1);
        printMe(arr);
    }
}
// Worst case time complexity occurs when pivot is always the smaller or the largest element.
// O(n2)
