package Functions_Methods;

import java.util.Scanner;

public class three{
    public static int facto(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            int fact=1;
            while(n>0){
                fact = fact*n;
                n--;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt(); 
        int factorial = facto(n); 
        System.out.println("Factorial of "+n+" is : "+factorial);
        sc.close();
    }
}