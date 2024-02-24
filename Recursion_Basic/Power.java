package Recursion_Basic;

public class Power {
    public static int getPower(int x , int n){
        if(n==0){
            return 1;
        }
        
        return x*getPower(x,n-1);
    }
    public static void main(String[] args) {
        int x =2;
        int n=5;
        System.out.println("The "+n+"Power of "+x+" is ="+getPower(x, n));
    }
}
