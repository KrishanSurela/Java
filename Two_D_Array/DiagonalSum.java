package Two_D_Array;

public class DiagonalSum {
    public static int DiagSum(int matrix[][]){
       
        int sum=0;

        // Brute Force Approach O(n^2)

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         //Primary Diagonal Sum
        //         if(i==j){ 
        //             sum+=matrix[i][j];
        //         }
        //         // Secondary Diogonal Sum
        //         if(i+j==rows-1){ // 0+3 = 3 , 1+2 =3
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        // Optimize Code O(n)
        
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            } 
        }

        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}
                    };

        System.out.println("Sum Of Both Diagonals : "+DiagSum(matrix));  
    }
}
