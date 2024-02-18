package Two_D_Array;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                if(startCol==endCol){
                    break; 
                }
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottem

            for(int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    break; 
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left

            for(int i=endRow-1;i>=startRow+1;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,10},
                          {5,6,7,8,15},
                          {9,10,11,12,20},
                          {13,14,15,16,25}
                          };
        printSpiral(matrix);                  

    }
}
