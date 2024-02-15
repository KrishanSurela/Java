 
public class PairInArray {
    public static void pair(int numbers[]){
        int totalPairs=0;
        for(int i=0;i<numbers.length;i++){
            int currect = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+currect+","+numbers[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+totalPairs); // (n*(n-1)/2)
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,6,7,8,9};
        pair(numbers);
    }
}

// Time Complexity => O(npower2)
