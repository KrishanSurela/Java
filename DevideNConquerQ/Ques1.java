package DevideNConquerQ;

// Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase).
public class Ques1 {
    public static String[] mergeSort(String arr[], int si, int ei) {
        if (si == ei) {
            String a[] = { arr[ei] };
            return a;
        }
        int mid = si + (ei - si) / 2;

        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid + 1, ei);
        return merge(arr1, arr2);
    }

    public static String[] merge(String arr1[], String arr2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        String temp[] = new String[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (isSmaller(arr1[i], arr2[j])) {
                temp[k] = arr1[i];
                i++;
            } else {
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }

        return temp;
    }

    public static boolean isSmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "camel", "lion", "tiger" };

        String ar[] = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
