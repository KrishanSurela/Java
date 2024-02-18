package Two_D_Array;
//Write a program to Find Transpose of a Matrix.
public class Qthree {
    public static void printMe(int arr[][]){
        int row=arr.length;
        int col = arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeArr(int arr[][]){
        int transpose [][] = new int [arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transpose[j][i]=arr[i][j];
            }
        } 
        return transpose;

        // here 2d array is return type because a new transepose array is created.
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        System.out.println("Original Matrix :");
        printMe(arr);  
        System.out.println("TransePose Matrix :"); 
        printMe(transposeArr(arr));   
    }
}
