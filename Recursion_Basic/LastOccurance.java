package Recursion_Basic;

// write the code for last occurance of element from array using recursion.
public class LastOccurance {
    public static int lastOccuranceOfElement(int arr[], int key, int currentIndex) {
        if (currentIndex == -1) {
            return -1;
        }
        if (arr[currentIndex] == key) {
            return currentIndex;
        }
        return lastOccuranceOfElement(arr, key, currentIndex - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 7, 6, 5, 9 };
        System.out.println(lastOccuranceOfElement(arr, 9, arr.length - 1));

    }
}
