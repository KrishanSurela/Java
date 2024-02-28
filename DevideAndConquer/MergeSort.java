public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int i = si; // starting index for left sorted part
        int j = mid + 1; // starting index for right sorted part
        int k = 0; // index for temp array
        int temp[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) { // comparing between both side array
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) { // remaining item of left array
            temp[k++] = arr[i++];
        }
        while (j <= ei) { // remaining item of right array
            temp[k++] = arr[j++];
        }
        // copy temp array to original array and this will reflect automatically throw
        // call by reference
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printMe(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 3, 8, 6, 9, 23, 4, 34, 21 };
        mergeSort(arr, 0, arr.length - 1);
        printMe(arr);
    }

}