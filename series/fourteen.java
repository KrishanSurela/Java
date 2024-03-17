public class fourteen {
    public static void main(String[] args) {
        int n=4,p=1,sum=0;
        for(int i=1;i<=n;i++){
            int number = p*10-1;
            sum = sum+number;
            p = p*10;
        }
        System.out.println(sum);
    }
}
