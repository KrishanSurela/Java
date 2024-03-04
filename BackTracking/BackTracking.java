package BackTracking;

public class BackTracking {
    public static void changeArr(int arr[], int i, int val) {
        // Base Case
        if (i == arr.length) {
            printme(arr);
            System.out.println();
            return;
        }
        arr[i] = val;
        // Recursion
        changeArr(arr, i + 1, val + 1); // function call step
        arr[i] = arr[i] - 2; // BackTracking step

    }

    public static void printme(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printme(arr);
    }
}
