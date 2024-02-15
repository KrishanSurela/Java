package Sorting;

public class BubbleSort {
    public static void BubbleS(int arr[]){
        
        int swapped=0;
        int n = arr.length;
        for(int turn =0;turn<=n-2;turn++){
             
            for(int j=0;j<=n-2-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped++;
                }
            }
        }
        if(swapped==0){
            System.out.println("The array is already sorted");
        }
    }
    public static void printArray(int arr[]){ 
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        BubbleS(arr);
        printArray(arr);
    }
}
