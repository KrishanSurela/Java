package Loops_java;
import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number :");

        int n = sc.nextInt();
        boolean isPrime=true;
        if(n==2){
            System.out.println("Given Number is Prime");
        }
        else{
            for(int i=2;i<=(n-1)/2;i++){ //i<=(n-1)/2 or i<=Math.sqrt(n);
                if(n%i==0){ 
                    isPrime = false;
                    break;
                }
            }
    
            if(isPrime==true){
                System.out.println("Given Number is Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        
        sc.close();
    }
}
