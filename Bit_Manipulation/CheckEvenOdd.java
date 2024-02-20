package Bit_Manipulation;
import java.util.*;
public class CheckEvenOdd {
    public static boolean check(int number){
        int bitmask=1;
        if((number & bitmask) ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int number = sc.nextInt();
        if(check(number)){
            System.out.println("Given Number is Even");
        }else{
            System.out.println("Given Number is Odd");
        }
        sc.close();
    }
}
