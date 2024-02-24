package Recursion_Basic;

// Write a function the first occurance of an element in an array.
public class Check1stOccurance {
    
    public static void main(String[] args) {
        int arr[] ={2,4,5,8,7,5,8,3};
        System.out.println(returnFirstOccurance(arr, 3, 0));
    }
    public static int returnFirstOccurance(int arr[],int key,int i){ 
        if(arr.length==i){  
            return -1;
        } 
        if(arr[i]==key){
        return i;
        }
        return returnFirstOccurance(arr, key,i+1);
    }
}