package Functions_Methods;
import java.util.*;

public class Seven {
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
    public static void findPrimeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
               System.out.print(i+" ");
            } 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number till Where you will want to find Prime Number :");
        int num = sc.nextInt();
        System.out.println("All Prime Number till "+num);
        findPrimeInRange(num);

        sc.close();
    }
}
