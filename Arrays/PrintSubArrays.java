 
public class PrintSubArrays { // a continuous part of array
    public static void printSubArrays(int numbers[]){
        int ts =0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    //print sub array
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : "+ts); // (n*(n+1)/2)
    }
    public static void main(String[] args) {
        int numbers[] = {4,6,8,6,14};
        printSubArrays(numbers);
    }
    
}
