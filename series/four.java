public class four{
    public static void main(String[] args){
        int n=5,i=1,sum_series=0;
        while(i<=n){
            int multiply=1;
            for(int j=1;j<=i;j++){
                multiply*=j;
            }
            sum_series+=multiply;
            i++;
        }
        System.out.println("The sum of the series : "+sum_series);
    }
}