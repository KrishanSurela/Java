public class five {
    public static void main(String[] args) {
        int n=5,sum=0,fact=1;
        for(int i=1;i<=n;i++){
             fact=fact*i;
             sum=sum+fact;
        }
        System.out.println(sum);
    }
}
