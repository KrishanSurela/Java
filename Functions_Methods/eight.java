package Functions_Methods;
import java.util.*;
public class eight {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){ 
                    return false; 
                }
            }
        } 
        return true;
    }
    public static void findPrimeInRange(int n,int p){
        for(int i=n;i<=p;i++){
            if(isPrime(i)){
               System.out.print(i+" ");
            } 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Lower Limit :");
        int num = sc.nextInt();
        System.out.println("Enter Your Upper Limit :");
        int num2 = sc.nextInt();
        System.out.println("All Prime Number Between "+num+" and "+num2);
        findPrimeInRange(num,num2);

        sc.close();
    }
}
