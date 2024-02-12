package Functions_Methods;
import java.util.*;
public class nine {
    public static void binToDec(int n){
        int dec =0;
        int pow =0; 
        int realBin =n ;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            n=n/10;
           
        }

        System.out.println("Decimal Number of \""+realBin+"\" is : "+dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number :");
        int num = sc.nextInt();
        binToDec(num);
        sc.close();
    }
}
