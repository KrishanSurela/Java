public class RemoveElementFromArray {
    public static void main(String[] args) {
        int arr[] = { 61, 82, 10, 63, 10, 35, 48, 10, 85, 10 };
        int target = 10;
        int counter = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                counter++;
            } else if (counter > 0) {
                arr[i - counter] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(i>=n-counter){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

Output:

61 82 63 35 48 85 0 0 0 0