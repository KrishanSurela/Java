package Recursion_Basic;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();
        RecursionConcept rc = new RecursionConcept();
        int result = rc.displayFactorialNumber(n);
        if(result==-1){ 
        System.out.println("invalid input");
        }else{
            System.out.println(result);
        }
        sc.close();
    }
}
class RecursionConcept{
    int num;
    int fact;
    
    int displayFactorialNumber(int num){
        if(num==0 || num==1){
            return 1;
        }
        else if(num<0){
            return -1;
        }else{
            fact = num * displayFactorialNumber(num-1);
            return fact;
        }
    }
} 
