public class SquareCount {
    
    // using Brute Force Approach
    public static void main(String[] args) {
         int i,j,count=0,row=2,col=5;
         while(row>0 && col>0){
             for(i=0;i<row;i++){
                 for(j=0;j<col;j++){
                     count++;
                 }
             }
             row--;
             col--;
         }
         System.out.println("count : " + count);
    }
    // public static void main(String[] args) {
    //     int n = 5; // Size of the matrix (4x4)
    //     int totalSquares = cntSquares(n);
    //     System.out.println("Total squares in a " + n + "x" + n + " matrix: " + totalSquares);
    // }

    // public static int cntSquares(int n) {
    //     // Calculate the total number of squares using the formula
    //     return n * (n + 1) * (2 * n + 1) / 6;
    // }
}
