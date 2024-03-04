// with Modify Binary Search algorithms
public class SearchInRotatedSortedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if(si>ei){
            return -1;
        }
        // kaam

        int mid = si + (ei - si) / 2;
        // case Found

        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1

        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && arr[mid] >= tar) {
                return search(arr, tar, si, mid - 1);
            }
            // case b :right
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case c : right"
            if (arr[mid] <= tar && arr[ei] >= tar) {
                return search(arr, tar, mid + 2, ei);
            }
            // case d: left;
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7; // output ->3
        int tarInd = search(arr, target, 0, arr.length - 1);
        System.out.println(tarInd);
    }
}
