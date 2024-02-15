 
public class MaxSubArraySum {
    public static void MaxSArraySum(int numbers[]){  
        int largestSum = Integer.MIN_VALUE; 
        for(int i =0;i<numbers.length;i++){
            int start = i; 
            for(int j =i ;j<numbers.length;j++){
                int end =j;
                int sum=0;
                for(int k=start;k<=end;k++){
                     System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                } 
                
                System.out.println();
                System.out.println("sum of this array : "+sum); 
               if(largestSum<sum){
                largestSum =sum;
               }
            }
        }
         System.out.println("Maximum Sum : "+largestSum); 
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        MaxSArraySum(numbers);
    }
}

// time complexicity : O(npower3) sabse buri time complexity (brute force approach)

// esse acchi approach (prefix Sum approach)