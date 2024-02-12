package Functions_Methods;
import java.util.*;
public class twelve {
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Number :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = sumOfDigits(num);

        System.out.println("Sum of Digits of Given Number is "+sum);
        sc.close();
    }
}
