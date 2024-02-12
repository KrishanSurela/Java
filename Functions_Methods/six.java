package Functions_Methods;
import java.util.*;

public class six {

    public static boolean isPrime(int n){
        // boolean isPrime=true;
        // if(n==2){
        //     isPrime=true;
        // }else{
        //     for(int i=2;i<=(n-1)/2;i++){
        //         if(n%i==0){
        //             isPrime=false;
        //             break; 
        //         }
        //     }
        // }
        // return isPrime;
 
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
    public static void main(String[] args) {
        System.out.println("Enter Number which you want to check Prime Or Not :");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean isPrime = isPrime(num);

        if(isPrime){
            System.out.println("Given Number "+num+" is Prime Number");
        }
        else{
            System.out.println("Given Number "+num+" is Not a Prime Number");
        }
        sc.close();
    }
}
