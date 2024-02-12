package Functions_Methods;

import java.util.Scanner;

public class four {
    // to calculate binomial cofficiant (nCr)

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

    public static int BinoCofficiant(int n,int r){
           return facto(n)/(facto(r)*facto(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n :");
        int n = sc.nextInt();
        System.out.println("Enter value of r :");
        int r = sc.nextInt();

        System.out.println("binomial cofficiant is :"+BinoCofficiant(n,r));

        sc.close();
    }

}
