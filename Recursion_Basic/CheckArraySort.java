package Recursion_Basic;

public class CheckArraySort {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    } 
    public static void main(String[] args) {
        int arr[] = { 34, 45, 56, 7, 78, 89 };
        System.out.println(isSorted(arr, 0));
    }
}

//Time Complexity => O(n)
//Space Coplexity => O(n)