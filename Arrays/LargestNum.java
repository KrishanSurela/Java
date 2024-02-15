  
public class LargestNum {
    public static int findLargestNumber(int arr[]){
        /*
          Integer.MIN_VALUE => - Infinity
          Integer.MAX_VALUE => + Infinity
         */
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            } 
            if(smallest>arr[i]){
                smallest =arr[i];
            }
        }
        System.out.println("Smallest value is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};

        int number= findLargestNumber(arr);

        System.out.println("Largest Value is "+ number);
    }
}
