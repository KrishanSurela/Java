package Two_D_Array;
//Print the number of 7’s that are in the 2d array.
public class Qone {
    public static int Counter8 (int arr[][]){
        int row=arr.length;
        int col = arr[0].length;
        int counter =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==8){
                    counter++;
                } 
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        System.out.println("Freq. of 8 : "+Counter8(arr));
    }
}
