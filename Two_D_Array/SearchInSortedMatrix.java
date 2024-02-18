package Two_D_Array;

public class SearchInSortedMatrix {
    public static boolean stairCaseSearch(int matrix[][],int key){
        // Considering starting point is (top right)
        // int row = 0 ,col = matrix[0].length-1;
        // while(row<matrix[0].length && col>=0){
        //     if(matrix[row][col]==key){
        //         System.out.println("found key at ("+row+","+col+")");
        //         return true;
        //     }
        //     else if(key < matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Key Not Found");
        // return false;

        // Considering starting point is (left bottem)
         
        int row = matrix.length-1 ,col = 0;
        while (col < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--; // Move up one row
            } else {
                col++; // Move right one column
            }
        }
        System.out.println("Key Not Found");
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {31,29,27,48},
                          {32,22,39,50}};
        int key =27;  
        stairCaseSearch(matrix, key);           
    }
}
