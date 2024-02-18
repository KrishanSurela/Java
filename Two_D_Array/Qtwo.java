package Two_D_Array;
// Print out the sum of the numbers in the second row of the “nums” array.
public class Qtwo {
    public static int secondRowSum(int arr[][]){
        int sum=0; 
        int col = arr[0].length;
        for(int i=0;i<col;i++){
            sum+=arr[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        System.out.println("sum of 2nd row is : "+secondRowSum(arr));
    }
}
