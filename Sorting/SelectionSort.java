package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){ 
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                } 
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){ 
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String[] args) {
        int numbers[]= {3,5,2,1,4};
        selectionSort(numbers);
        printArray(numbers);
    }
}
