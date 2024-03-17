public class six {
    public static int power(int i,int j){
        int powert=1;
        while(j!=0){
            powert = powert * i;
            j--;
        }
        return powert;
    }
    public static void main(String[] args) {
        int n=7;
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+power(i,i)/i;
        }
        System.out.println(sum);
    }
}
