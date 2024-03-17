public class one{
    public static void sumOfSeries(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum=sum+power(i,i);
        }
        System.out.println("Sum of Series : "+sum);
    }
    public static int power(int i,int j){
        int result =1;
        while(j!=0){
            result =result*i;
            j--;
        }
        return result;
    }
    public static void main(String[] args) {
        int n=4;
        sumOfSeries(n);
    }
    
}