public class twelve {
    public static void main(String[] args) {
        int n=5;
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum =sum+ (double)1/(2*i-1);
        }
        System.out.println(sum);
    }
}
