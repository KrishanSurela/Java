package Arrays; 
 
public class BinarySearch {
    public static int BinaryS(int numbers [],int key){
        int start =0;
        int end = numbers.length-1;
        while(start<=end){
            int mid  = (start+end)/2; 
            //comparisons 
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ // right part
                start = mid+1;
            }
            else{ // left part
                end = mid-1;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 18; 
        if(BinaryS(numbers, key)==-1){
            System.out.println("Key is not in array");
        }else{
             System.out.println("Index for key is :"+BinaryS(numbers, key));
        }
    }
}
