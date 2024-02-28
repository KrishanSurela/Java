package Recursion_Q;

public class PrintAllOccurance {
    public static void printAllOccu(int arr[], int index, int key) {
        // base case
        if (index == arr.length) {
            return;
        }
        if (arr[index] == key) {
            System.out.print(index + " ");
        }

        printAllOccu(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 2, 3, 2, 8, 2 };
        printAllOccu(arr, 0, 2);
    }
}
