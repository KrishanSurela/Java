import java.util.Scanner;

public class findNumberDevisibleby2Nums {
    public static void findNumberDevisibleby5And3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println("Element " + arr[i] + " is devisible by 5 and 3");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + "th Elements : ");
            arr[i] = sc.nextInt();
        }
        findNumberDevisibleby5And3(arr);
        sc.close();
    }
}
