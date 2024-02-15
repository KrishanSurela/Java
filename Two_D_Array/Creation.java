package  Two_D_Array;
import java.util.*;
public class Creation {
    public static boolean search(int arr[][],int key){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key==arr[i][j]){
                    System.out.println("Found at cell  ("+i+","+j+") ");
                    return true;
                }
               
            }
            System.out.println();
        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows in Matrix : ");
        int m=sc.nextInt();
        System.out.println("Enter Number of columns in Matrix : ");
        int n=sc.nextInt();
        int key=3;
        int arr [][] = new int[m][n];
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, key);
        sc.close();
    }
}
