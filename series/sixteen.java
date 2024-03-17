public class sixteen {
    public static void main(String[] args) {
        int number=3,sum=0,d=4,n=5;
        for(int i=1;i<=n;i++){
            sum = sum + number;
            number = number +d;
            d = d+2;
        }
        System.out.println(sum);
    }
}
