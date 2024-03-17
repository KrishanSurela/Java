public class three {
    //find the sum of series (1+(1+2)+(1+2+3)+ ...till N).

    public static void main(String[] args) {
        int n=5,i=1;
        int sum=0;
        while(i<=n){ 
            for(int j=1;j<=i;j++){
                sum=sum+j;
            }
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}
